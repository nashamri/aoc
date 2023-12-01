(ns day04.solution
  (:require [clojure.string :as str]
            [clojure.set :as s]))

(def sample "src/day04/sample.txt")
(def input "src/day04/input.txt")

(defn parse [f]
  (->> (slurp f)
       (#(str/split % #"\n"))
       (mapv #(str/split % #","))
       (mapv (fn [x] (mapv #(str/split % #"-") x)))
       (mapv (fn [x] (mapv (fn [y] (mapv parse-long y)) x)))
       (mapv (fn [[[x1 y1] [x2 y2]]] [[x1 (inc y1)] [x2 (inc y2)]]))))

(defn part1-sol [f]
  (get (frequencies
        (mapv
         (fn [[x y]]
           (or (s/subset?
                (set (apply range x))
                (set (apply range y)))
               (s/subset?
                (set (apply range y))
                (set (apply range x)))))
         (parse f)))
       true))

(defn part2-sol [f]
  (get (frequencies
        (mapv
         (fn [[x y]]
           (empty? (s/intersection
                    (set (apply range x))
                    (set (apply range y)))))
         (parse f)))
       false))

(comment
  (get (frequencies
        (mapv
         (fn [[x y]]
           (empty? (s/intersection
                    (set (apply range x))
                    (set (apply range y)))))
         (-> sample (parse))))
       false)
  ;
  (empty? (s/intersection #{1 2} #{3 4})))

(defn -main [& _]
  (println (str "Part 1: " (part1-sol input)))
  (println (str "Part 2: " (part2-sol input))))
