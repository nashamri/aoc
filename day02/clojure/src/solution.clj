(ns solution
  (:require [clojure.string :as str]
            [clojure.core.match :refer [match]]))

(defn parse [data]
  (->> data
       (#(str/split % #"\n"))
       (mapv #(str/split % #"\n"))
       (mapv (fn [[x]]
               (mapv keyword (str/split x #" "))))))

(defn score-p1
  "A:X:1 Rock
   B:Y:2 Paper
   C:Z:3 Scissors"
  [s] (match s
        [:A :X] (+ 1 3)
        [:A :Y] (+ 2 6)
        [:A :Z] (+ 3 0)
        [:B :X] (+ 1 0)
        [:B :Y] (+ 2 3)
        [:B :Z] (+ 3 6)
        [:C :X] (+ 1 6)
        [:C :Y] (+ 2 0)
        [:C :Z] (+ 3 3)))

(defn score-p2
  "A:X:1 Rock
   B:Y:2 Paper
   C:B:3 Scissors
   X:0 Lose
   Y:3 Draw
   Z:6 Win"
  [s] (match s
        [:A :X] (+ 3 0)
        [:A :Y] (+ 1 3)
        [:A :Z] (+ 2 6)
        [:B :X] (+ 1 0)
        [:B :Y] (+ 2 3)
        [:B :Z] (+ 3 6)
        [:C :X] (+ 2 0)
        [:C :Y] (+ 3 3)
        [:C :Z] (+ 1 6)))

(defn common []
  (->> (slurp "input.txt") (parse)))

(defn part1-sol []
  (->> (common)
       (mapv score-p1)
       (reduce +)))

(defn part2-sol []
  (->> (common)
       (mapv score-p2)
       (reduce +)))

(defn -main
  "Invoke me with clojure -M -m solution"
  [& _]
  (println (str "Part 1: " (part1-sol))) ;11063
  (println (str "Part 2: " (part2-sol))) ;10349
  )
