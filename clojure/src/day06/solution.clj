(ns day06.solution
  (:require [clojure.string :as str]))

(def sample "src/day06/sample.txt")
(def input "src/day06/input.txt")

(defn parse [f]
  (->> (slurp f)))

(defn part1-sol [f]
  (->> (parse f)
       (partition 4 1)
       (map-indexed (fn [idx itm] [idx itm (apply distinct? itm)]))
       (filter (fn [[_ _ pred]] pred))
       (first)
       ((fn [[i _ _]] (+ i 4)))))

(defn part2-sol [f]
  (->> (parse f)
       (partition 14 1)
       (map-indexed (fn [idx itm] [idx itm (apply distinct? itm)]))
       (filter (fn [[_ _ pred]] pred))
       (first)
       ((fn [[i _ _]] (+ i 14)))))

(comment)

(defn -main [& _]
  (println (str "Part 1: " (part1-sol input)))
  (println (str "Part 2: " (part2-sol input))))
