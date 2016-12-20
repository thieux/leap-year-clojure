(ns clojure-leap-year.core
  (:gen-class))

(defn is-leap [y] 
  (cond (= 0 (mod y 400)) true
        (= 0 (mod y 100)) false
        :else (= 0 (mod y 4))))
