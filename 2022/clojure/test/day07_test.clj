(ns day07-test
  (:require [clojure.test :as t]
            [day07.solution :as s]))

(t/deftest day07
  (t/testing "Part 1"
    (t/is (= 95437 (s/part1-sol s/sample)))
    (t/is (= 0 (s/part1-sol s/input))))

  (t/testing "Part 2"
    (t/is (= 0 (s/part2-sol s/sample)))
    (t/is (= 0 (s/part2-sol s/input)))))

