(ns clj-test.core
  (:gen-class)
  (:require [clojure.string :as str])
)

(def MY_NAME "ANSON FOONG") ; declare global variable STRING

(defn greeting [name] (str "Hello " name)) ; returns a string
(def getAge (fn [age] (str "Age: " age))) ; returns age
(defn someFunction [p, s] (println "I am some function") (println p) (println s))

(defn callme [phone, state]
  (apply someFunction phone state)
)

(defn tempFunc [] (
  let [MY_NAME "JACK RABBIT"]
    (println MY_NAME)
  )
  (println MY_NAME)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")

  (def myname "Anson Foong")
  (def age 21)
  (def male true)
  (println (greeting "Jake"))
  (def myage (getAge 18)) ; declare a variable called myage and set it equal to getAge()
  (println myage)
  (callme "1" "2")
  (tempFunc)
)
