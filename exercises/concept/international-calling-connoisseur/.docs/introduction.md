# Introduction

A hashmap (or simply map) is a collection of elements where each element comprises a key and value. It has the same role as maps or associative arrays do in other languages.

A hashmap can be created as follows:

```clojure
(hash-map)
;; => {}
```

Or simply

```clojure
{}
```
Functions for operating on maps will return a new map, while the original map remains unchanged.
The values in a map may be of heterogenous types. 

Once constructed, entries can be added or removed from a hashmap using the functions `assoc` and `dissoc`.

New values are added to maps with the `assoc` (short for "associate") function:

```clojure
(def numbers
  {1 "One"
   2 "Two"})

;; Set the value of the element with key 2 to "Deux"
(assoc numbers 2 "Deux")
;; => {1 "One", 2 "Deux"}
```

Retrieving values in a hashmap can be done using get:

```clojure
(get numbers 2)
;; => "Deux"
```

You can test if a value exists in the map with `contains?`:

```clojure
(contains? numbers 2)
// => true
```
