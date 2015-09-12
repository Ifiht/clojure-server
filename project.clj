(defproject clojure-server "0.0.1"
  :description "This is a basic clojure web server."
  :url "http://www.emersea.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
  				 [org.clojure/java.jdbc "0.4.1"]
  				 [org.postgresql/postgresql "9.4-1201-jdbc41"]]
  :main clojure-server.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
