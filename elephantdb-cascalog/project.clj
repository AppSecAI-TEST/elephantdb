(defproject elephantdb/elephantdb-cascalog "0.4.2"
  :min-lein-version "2.0.0"
  :description "ElephantDB Integration for Cascalog."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clj"]
  :javac-options ["-source" "1.6" "-target" "1.6"]
  :jvm-opts ["-server" "-Xmx768m"]
  :dependencies [[elephantdb/elephantdb-cascading "0.4.2"]]
  :profiles {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :provided {:dependencies [[cascalog/cascalog-core "1.10.2-SNAPSHOT"]]}
             :dev {:dependencies
                   [[elephantdb/elephantdb-bdb "0.4.2"]
                    [org.apache.hadoop/hadoop-core "0.20.2"]
                    [cascalog/midje-cascalog "1.10.2-SNAPSHOT"]]
                   :plugins [[lein-midje "3.0.0"]]}})
