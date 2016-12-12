(ns clojure-leap-year.core
  (:gen-class))

(defn is-leap [y] (if (= 1900 y) false (if (= 0 (mod y 4)) true false)))
