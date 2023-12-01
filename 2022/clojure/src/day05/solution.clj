(ns day05.solution
  (:require [clojure.string :as str]))

(def sample "src/day05/sample.txt")
(def input "src/day05/input.txt")

(defn transpose [& xs]
  (apply mapv (comp vector str) xs))

(defn parse [f]
  (let [[crates_ stmts_] (str/split (slurp f) #"\n\n")
        crates_ (->> (apply transpose (str/split crates_ #"\n"))
                     (remove #(or (str/includes? (first %) "[")
                                  (str/includes? (first %) "]")
                                  (str/blank? (first %))))
                     (mapv (fn [[x]] mapv (str/trimr (apply str (reverse x))))))
        crates_ (for [xs crates_]
                  (as-> xs $
                    (str/split $ #"")
                    (mapv keyword $)))
        crates_head (mapv #(first %) crates_)
        crates_rest (mapv #(rest %) crates_)
        crates_ (mapv (fn [x xs] {x (vec xs)}) crates_head crates_rest)
        crates (into {} crates_)
        stmts_ (re-seq #"move (\d+) from (\d+) to (\d)" stmts_)
        stmts (mapv (fn [[_ c f t]] [(parse-long c) (keyword f) (keyword t)]) stmts_)
        codex {:crates crates :stmts stmts}]
    codex))

(def state (atom {}))

(defn up! [[c f t]]
  (dotimes [_ c]
    (let [x (peek (f (:crates @state)))
          xs (pop (not-empty (f (:crates @state))))]
      (swap! state update-in [:crates t] conj x)
      (swap! state assoc-in [:crates f] xs))))

(defn concatv [x coll]
  (vec (concat x coll)))

(defn up2! [[c f t]]
  (let [x  (take-last c (f (:crates @state)))
        xs (drop-last c (f (:crates @state)))]
    (swap! state update-in [:crates t] concatv (vec x))
    (swap! state assoc-in [:crates f] (vec xs))))

(defn part1-sol [f]
  (reset! state (parse f))
  (mapv up! (:stmts @state))
  (apply str (map #((comp name last) %) (vals (sort (:crates @state))))))

(defn part2-sol [f]
  (reset! state (parse f))
  (mapv up2! (:stmts @state))
  (apply str (map #((comp name last) %) (vals (sort (:crates @state))))))

(comment
  ;
  )

(defn -main [& _]
  (println (str "Part 1: " (part1-sol input)))
  (println (str "Part 2: " (part2-sol input))))
