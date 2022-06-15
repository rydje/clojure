(ns wizards-and-warriors)

(defmulti to-string
  (fn [character] (:type character)))

(defmethod to-string :warrior
  [character]
  "Character is a Warrior")

(defmethod to-string :wizard
  [character]
  "Character is a Wizard")

(defmulti vulnerable?
  (fn [character] (:type character)))

(defmethod vulnerable? :default
  [character]
  false)

(def spell-prepared? (atom false))

(defmethod vulnerable? :wizard
  [character]
  (not @spell-prepared?))

(defn prepare-spell []
  (reset! spell-prepared? true))

(vulnerable? {:type :wizard})