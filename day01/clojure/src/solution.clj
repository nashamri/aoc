(ns solution
  (:require [clojure.string :as str]))

(defn common []
  (->> (slurp "input.txt")
       (#(str/split % #"\n\n"))
       (mapv #(str/split % #"\n"))
       (mapv #(mapv parse-long %))
       (mapv #(reduce + %))))

(defn part1-sol []
  (->> (common) (sort >) (first)))

(defn part2-sol []
  (->> (common) (sort >) (take 3) (reduce +)))

(defn -main
  "Invoke me with clojure -M -m solution"
  [& _]
  (println (str "Part 1: " (part1-sol)))
  (println (str "Part 2: " (part2-sol))))
