(ns clojure-leap-year.core-test
  (:require [clojure.test :refer :all]
            [clojure-leap-year.core :refer :all]))

(defn is-leap [y] true)

(deftest test-leap
  (testing "1996 should be leap"
    (is (= (is-leap 1996) true))))
