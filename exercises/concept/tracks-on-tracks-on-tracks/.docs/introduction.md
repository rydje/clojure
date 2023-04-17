# Introduction

Lists in Clojure are ordered collections enclose in parentheses.

Clojure lists can be created in one of two ways. The `list` function can create a list, or you can `quote` a literal list.

If not quoted, Clojure would attempt to call the first element as a function:

```clojure
(1 2 3)
;=> Cannot call 1 as a function.
```

The list can be quoted either using `(quote (1 2 3))` or the shorthand `'(1 2 3)`, preventing it from being evaluated.

Clojure lists are _heterogeneous_, they can contain any combination of types e.g., `'(2 "a" "b" 3)`.
Unlike other Lisps, an empty list in Clojure is truthy and is not equivalent to `nil` or `false`.
