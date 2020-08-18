(ns local-root-example.core
  (:require [clj-time.core :as t]
            [support.math :refer [add]]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World! The time is:" (t/now) " 2 + 2 = " (add 2 2)))

(comment
  (-main))