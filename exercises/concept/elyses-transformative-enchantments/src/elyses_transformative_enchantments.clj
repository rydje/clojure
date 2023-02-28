(ns elyses-transformative-enchantments)

(defn seeing-double [deck]
  (map (fn double [x] (* x 2)) 
       deck))

(comment
  (seeing-double [1, 2, 3, 4])

  (mapv (fn [x] (dec x))
       [1 2 3 4])
  )