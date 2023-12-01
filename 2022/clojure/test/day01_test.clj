(ns day01-test
  (:require [clojure.test :as t]
            [day01.solution :as s]))

(t/deftest day01
  (t/testing "Part 1"
    (t/is (= 24000 (s/part1-sol s/sample)))
    (t/is (= 69626 (s/part1-sol s/input))))

  (t/testing "Part 2"
    (t/is (= 45000 (s/part2-sol s/sample)))
    (t/is (= 206780 (s/part2-sol s/input)))))
