(ns day03.solution
  (:require [clojure.string :as str]))

(def sample "src/day03/sample.txt")
(def input "src/day03/input.txt")

(defn parse [f]
  (->> (slurp f)
       (#(str/split % #"\n"))))

(defn half-it [xs]
  (let [i (/ (count xs) 2)]
    [(apply str (take i xs))
     (apply str (drop i xs))]))

(defn find-comp [[x y]]
  (first (for [i x j y
               :when (= i j)]
           (-> i str keyword))))

(defn group-badges [xs]
  (partition 3 xs))

(defn find-badge [[x y z]]
  (first (for [i x j y k z
               :when (= i j k)]
           (-> i str keyword))))

(def prios (let [a (map (comp keyword str char) (range 97 123))
                 A (map (comp keyword str char) (range 65 91))
                 alphas (concat a A)]
             (zipmap alphas (drop 1 (range)))))

(defn part1-sol [f]
  (->> (parse f)
       (mapv (comp find-comp half-it))
       (mapv #(% prios))
       (reduce +)))

(defn part2-sol [f]
  (->> (parse f)
       group-badges
       (mapv  find-badge)
       (mapv #(% prios))
       (reduce +)))

(defn -main [& _]
  (println (str "Part 1: " (part1-sol input))) ;8018
  (println (str "Part 2: " (part2-sol input))) ;2518
  )
