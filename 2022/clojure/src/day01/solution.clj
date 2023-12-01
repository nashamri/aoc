(ns day01.solution
  (:require [clojure.string :as str]))

(def sample "src/day01/sample.txt")
(def input "src/day01/input.txt")

(defn parse [f]
  (->> (slurp f)
       (#(str/split % #"\n\n"))
       (mapv #(str/split % #"\n"))
       (mapv #(mapv parse-long %))
       (mapv #(reduce + %))))

(defn part1-sol [f]
  (->> (parse f) (sort >) (first)))

(defn part2-sol [f]
  (->> (parse f) (sort >) (take 3) (reduce +)))

(defn -main [& _]
  (println (str "Part 1: " (part1-sol input)))
  (println (str "Part 2: " (part2-sol input))))
