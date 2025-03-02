(defproject luposlip/ubergraph "0.8.2"
  :description "Feature-loaded graph implementation"
  :url "http://github.com/engelberg/ubergraph"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.priority-map "0.0.10"]
                 [aysylu/loom "1.0.2"]
                 [dorothy "0.0.6"]
                 [com.rpl/specter "1.1.2"]
                 [potemkin "0.4.5"]]
  :codox {:output-path "doc"
          :namespaces [ubergraph.core ubergraph.alg]
          :source-uri "http://github.com/Engelberg/ubergraph/tree/master/{filepath}#L{line}"}
  )
