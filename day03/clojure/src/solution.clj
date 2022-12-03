(ns solution
  (:require [clojure.string :as str]))

(def trivial
  "vJrwpWtwJgWrhcsFMMfFFhFp
jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
PmmdzqPrVvPwwTWBwg
wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
ttgJtRGJQctTZtZT
CrZsJsPPZsGzwwsLwLmpwMDw")

(defn parse [data]
  (->> data
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

(defn common []
  (->> (slurp "input.txt") (parse)))

(defn part1-sol []
  (->> (common)
       (mapv (comp find-comp half-it))
       (mapv #(% prios))
       (reduce +)))

(defn part2-sol []
  (->> (common)
       group-badges
       (mapv  find-badge)
       (mapv #(% prios))
       (reduce +)))

(defn -main
  "Invoke me with clojure -M -m solution"
  [& _]
  (println (str "Part 1: " (part1-sol))) ;8018
  (println (str "Part 2: " (part2-sol))) ;2518
  )
