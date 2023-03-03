(ns day06.solution
  (:require [clojure.string :as str]))

(def sample "mjqjpqmgbljsphdztnvjfqwrcgsmlb")

(defn common []
  (->> (slurp "src/day06/input.txt")))

(defn part1-sol []
  (->> (common)
       (partition 4 1)
       (map-indexed (fn [idx itm] [idx itm (apply distinct? itm)]))
       (filter (fn [[_ _ pred]] pred))
       (first)
       ((fn [[i _ _]] (+ i 4)))))

(defn part2-sol []
  (->> (common)
       (partition 14 1)
       (map-indexed (fn [idx itm] [idx itm (apply distinct? itm)]))
       (filter (fn [[_ _ pred]] pred))
       (first)
       ((fn [[i _ _]] (+ i 14)))))

(comment)

(defn -main
  "Invoke me with clojure -M -m solution"
  [& _]
  (println (str "Part 1: " (part1-sol))) ; "Part 1: 1707"
  (println (str "Part 2: " (part2-sol))) ; "Part 2: 3697"
  )
