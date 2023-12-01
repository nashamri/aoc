(ns day03-test
  (:require [clojure.test :as t]
            [day03.solution :as s]))

(t/deftest day03
  (t/testing "Part 1"
    (t/is (= 157 (s/part1-sol s/sample)))
    (t/is (= 7597 (s/part1-sol s/input))))

  (t/testing "Part 2"
    (t/is (= 70 (s/part2-sol s/sample)))
    (t/is (= 2607 (s/part2-sol s/input)))))

