# Instructions

In this exercise you'll be writing code to keep track of international dialing codes via an international dialing code hashmap.

The map uses an integer for its keys (the dialing code) and a string (country name) for its values.

You have 6 tasks which involve dialing-codes.

## 1. Create a pre-populated hashmap

There exists a pre-populated hashmap which contains the following 3 dialing codes: "United States of America" which has a code of 1, "Brazil" which has a code of 55 and "India" which has a code of 91. Define the `countries` var to store the pre-populated hashmap:

```clojure
countries
;;=> {1 "United States of America", 55 "Brazil", 91 "India"}
```

## 2. Add a country to a map

Add "United Kingdom" with a dialing code of 44 to the map created in task 1, and capture the result in a var called `map-with-uk`:

```clojure
map-with-uk
;;=> {1 "United States of America", 44 "United Kingdom", 55 "Brazil", 91 "India"}
```

## 3. Get the country name matching a country code

Retrieve the name of the country with dialing code 55, and store the result in a var named `country-55`:

```clojure
country-55
;;=> "Brazil"
```

## 4. Update name of country in the map

Write a function called `update-country` that will replace the country of a code in the map, but return the map unchanged if the code is not present.

```clojure
(update-country countries 1 "les États-Unis")
;;=> {1 "les Ã‰tats-Unis", 55 "Brazil", 91 "India"}
(update-country countries 999, "Newlands")
;;=> {1 "United States of America", 55 "Brazil", 91 "India"}
```

## 5. Remove a country from the map

Remove India from the map, and store the result as a var named `countries-without-india`:

```clojure
countries-without-india
;;=> {1 "United States of America", 55 "Brazil"}
```

## 6. Find the country with the longest name

Write a function that will return the country with the longest name:

```clojure
(longest-name countries)
;;=> "United States of America"
```
