(ns day01.solution
  (:require [clojure.string :as str]))

(defn common []
  (->> (slurp "src/day01/input.txt")
       (#(str/split % #"\n\n"))
       (mapv #(str/split % #"\n"))
       (mapv #(mapv parse-long %))
       (mapv #(reduce + %))))

(defn part1-sol []
  (->> (common) (sort >) (first)))

(defn part2-sol []
  (->> (common) (sort >) (take 3) (reduce +)))

(defn -main [& _]
  (println (str "Part 1: " (part1-sol)))
  (println (str "Part 2: " (part2-sol))))
