(defproject clj-path "0.0.1"
  :description "Utilities for file and directory"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.3" :exclusions [org.clojure/clojure]]]}}
  :plugins [[lein-midje "3.1.3"]])
