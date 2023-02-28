(ns elyses-transformative-enchantments-test
  (:require [clojure.test :refer [deftest is testing run-tests]]
            [elyses-transformative-enchantments :refer :all]))

(deftest ^{:task 1} seeing-double-test
  (testing "doubles all the values"
    (is (= [2 4 6 8] (seeing-double [1 2 3 4])))
    (is (= [4 10 2 18] (seeing-double [2 5 1 9]))))
  (testing "works for a large deck"
    (is (= [12 6 14 4 2 18 16 20 10 8 14 2 6]
           (seeing-double [6 3 7 2 1 9 8 10 5 4 7 1 3]))))
  (testing "work for a small deck"
    (is (= [6] (seeing-double [3]))))
  (testing "can handle an empty deck"
    (is (= [] (seeing-double [])))))

;(deftest ^{:task 2} seeing-double-test)

(comment
  (run-tests)
  )

