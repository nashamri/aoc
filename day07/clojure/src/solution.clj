(ns solution
  (:require [clojure.string :as str]
            [flow-storm.api :as fs-api]
            [portal.api :as p]))

(defmacro forv [& forms]
  `(vec (for ~@forms)))

(def sample
  "$ cd /
$ ls
dir a
14848514 b.txt
8504156 c.dat
dir d
$ cd a
$ ls
dir e
29116 f
2557 g
62596 h.lst
$ cd e
$ ls
584 i
$ cd ..
$ cd ..
$ cd d
$ ls
4060174 j
8033020 d.log
5626152 d.ext
7214296 k")

(defn common []
  (->> (slurp "input.txt")))

(comment

  (def p (p/open))

  (add-tap #'p/submit)

  (p/close)

  (tap> sample)

  #rtrace (common)

  (fs-api/local-connect {:styles ".flow-storm-styles.css" :theme :dark})

  (reductions + (map inc (range 10)))

; 
  )

(defn part1-sol [data] 95437)

(defn part2-sol [])

(defn -main
  "Invoke me with clojure -M -m solution"
  [& _]
  (println (str "Part 1: " (part1-sol sample))) ;
  (println (str "Part 2: " (part2-sol))) ;
  )
