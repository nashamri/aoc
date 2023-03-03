(ns solution-test
  (:require [clojure.test :as t]
            [solution :as s]))

(t/deftest day07
  (t/testing "Sample Example Part 1"
    (t/is (= 95437 (s/part1-sol s/sample)))))

