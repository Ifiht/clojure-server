(ns clojure-server.core
  (:gen-class)
  (require '[clojure.java.jdbc :as sql]))

(sql/db-do-commands "postgresql://localhost:5432/shouter"
                           (sql/create-table-ddl :testing [:data :text]))

(sql/insert! "postgresql://localhost:5432/shouter"
                    :testing {:data "Hello World"})

(defn -main "The one and only." [& args]
  (println "🍻"))
