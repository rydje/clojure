(require '[cheshire.core :as json])

(defn config [lang] 
  (json/parse-string 
   (slurp (str "https://raw.githubusercontent.com/exercism/" 
               lang "/main/config.json")) true))

(defn teaches [x tracks]
  (for [track (map config tracks)]
    [(:slug track)
     (mapv :name (filter #(contains? (set (:concepts %)) x) 
                         (:concept (:exercises track))))]))

(teaches "lists" ["python" "csharp" "elixir" "javascript" 
                  "fsharp" "java" "ruby" "julia" "elm"
                  "rust" "haskell" "go" "swift" "common-lisp"
                  "jq"])