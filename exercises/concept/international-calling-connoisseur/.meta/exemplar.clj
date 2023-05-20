(ns international-calling-connoisseur)

(def countries
  {1 "United States of America", 55 "Brazil", 91 "India"})

(def map-with-uk
  (assoc countries 44 "United Kingdom"))

(def country-55
  (get countries 55))
 
(def us-fr
  (assoc countries 1 "les États-Unis"))

(def brazil-exists?
  (contains? countries 55))

(defn update-country [m code name]
  (if (contains? m code)
    (assoc m code name)
    m))

(def countries-without-india
  (dissoc countries 91))

(defn longest-name [m]
  (last (first (sort-by count m))))
