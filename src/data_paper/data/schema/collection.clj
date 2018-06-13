(ns data-paper.data.schema.collection)

(def schema [#:db{:ident       :collection/name
                  :cardinality :db.cardinality/one
                  :valueType   :db.type/string}

             #:db{:ident       :collection/title
                  :cardinality :db.cardinality/one
                  :valueType   :db.type/string}

             #:db{:ident       :collection/description
                  :cardinality :db.cardinality/one
                  :valueType   :db.type/string}])
