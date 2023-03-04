(ns day06-test
  (:require [clojure.test :as t]
            [day06.solution :as s]))

(t/deftest day06
  (t/testing "Part 1"
    (t/is (= 7 (s/part1-sol s/sample)))
    (t/is (= 1275 (s/part1-sol s/input))))

  (t/testing "Part 2"
    (t/is (= 19 (s/part2-sol s/sample)))
    (t/is (= 3605 (s/part2-sol s/input)))))
