(ns clojure-leap-year.core-test
  (:require [clojure.test :refer :all]
            [clojure-leap-year.core :refer :all]))

(defn is-leap [y] (if (= 0 (mod y 4)) true false))

(deftest test-leap
  (testing "1996 should be leap"
    (is (= (is-leap 1996) true))))

(deftest test-common
  (testing "2001 should be common"
    (is (= (is-leap 2001) false))))
