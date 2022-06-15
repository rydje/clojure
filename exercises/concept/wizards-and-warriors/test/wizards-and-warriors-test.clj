(ns wizards-and-warriors-test
  (:require [clojure.test :refer [deftest is testing]]
            [wizards-and-warriors :refer [to-string vulnerable spell-prepared? prepare-spell]]))

(deftest to-string-test
  (testing "Describe wizard"
    (is (= "Character is a Wizard" 
           (to-string {:type :wizard}))))
  (testing "Describe warrior"
    (is (= "Character is a Warrior"
           (to-string {:type :warrior})))))

(deftest vulnerable-test
  (testing "Warrior is not vulnerable"
    (is (false? (vulnerable {:type :warrior}))))
  (testing "Wizard is vulnerable by default"
    (is (true? (vulnerable {:type :wizard})))))

(deftest prepare-spell-test
  (testing "Wizard can prepare a spell"
         (is (true? (do (prepare-spell)
                         @spell-prepared?)))))

(comment
  (clojure.test/run-tests)
  )