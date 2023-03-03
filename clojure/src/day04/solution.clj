(ns day04.solution
  (:require [clojure.string :as str]
            [clojure.set :as s]))

(def sample
  "2-4,6-8
2-3,4-5
5-7,7-9
2-8,3-7
6-6,4-6
2-6,4-8")

(defn parse [data]
  (->> data
       (#(str/split % #"\n"))
       (mapv #(str/split % #","))
       (mapv (fn [x] (mapv #(str/split % #"-") x)))
       (mapv (fn [x] (mapv (fn [y] (mapv parse-long y)) x)))
       (mapv (fn [[[x1 y1] [x2 y2]]] [[x1 (inc y1)] [x2 (inc y2)]]))))

(defn common []
  (->> (slurp "src/day04/input.txt") (parse)))

(defn part1-sol []
  (get (frequencies
        (mapv
         (fn [[x y]]
           (or (s/subset?
                (set (apply range x))
                (set (apply range y)))
               (s/subset?
                (set (apply range y))
                (set (apply range x)))))
         (common)))
       true))

(defn part2-sol []
  (get (frequencies
        (mapv
         (fn [[x y]]
           (empty? (s/intersection
                    (set (apply range x))
                    (set (apply range y)))))
         (common)))
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

(defn -main
  "Invoke me with clojure -M -m solution"
  [& _]
  (println (str "Part 1: " (part1-sol))) ;515
  (println (str "Part 2: " (part2-sol))) ;883
  )
