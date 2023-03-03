(ns day02-test
  (:require [clojure.test :as t]
            [day02.solution :as s]))

(t/deftest day02
  (t/testing "Part 1"
    (t/is (= 15 (s/part1-sol s/sample)))
    (t/is (= 13484 (s/part1-sol s/input))))

  (t/testing "Part 2"
    (t/is (= 12 (s/part2-sol s/sample)))
    (t/is (= 13433 (s/part2-sol s/input)))))
