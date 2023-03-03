(ns day01-test
  (:require [clojure.test :as t]
            [day01.solution :as s]))

(t/deftest day01
  (t/testing "Part 1"
    (t/is (= 70116 (s/part1-sol))))
  (t/testing "Part 2"
    (t/is (= 206582 (s/part2-sol)))))
