(ns day05-test
  (:require [clojure.test :as t]
            [day05.solution :as s]))

(t/deftest day05
  (t/testing "Part 1"
    (t/is (= "CMZ" (s/part1-sol s/sample)))
    (t/is (= "RTGWZTHLD" (s/part1-sol s/input))))

  (t/testing "Part 2"
    (t/is (= "MCD" (s/part2-sol s/sample)))
    (t/is (= "STHGRZZFR" (s/part2-sol s/input)))))
