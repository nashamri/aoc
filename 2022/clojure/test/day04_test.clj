(ns day04-test
  (:require [clojure.test :as t]
            [day04.solution :as s]))

(t/deftest day04
  (t/testing "Part 1"
    (t/is (= 2 (s/part1-sol s/sample)))
    (t/is (= 485 (s/part1-sol s/input))))

  (t/testing "Part 2"
    (t/is (= 4 (s/part2-sol s/sample)))
    (t/is (= 857 (s/part2-sol s/input)))))
