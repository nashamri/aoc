(ns day07.solution
  (:require [clojure.string :as str]))

(defmacro forv [& forms]
  `(vec (for ~@forms)))

(def sample "src/day07/sample.txt")
(def input "src/day07/input.txt")

(defn parse [f]
  (->> (slurp f)))

(comment
  (reductions + (map inc (range 10)))
; 
  )

(defn part1-sol [f] 1337)

(defn part2-sol [f] 1337)

(defn -main [& _]
  (println (str "Part 1: " (part1-sol input)))
  (println (str "Part 2: " (part2-sol input))))
