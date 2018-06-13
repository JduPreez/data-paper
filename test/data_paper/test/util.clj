(ns data-paper.test.util
  (:require [datomic.api :as d]
            [datomic.client.api :as dc]))

; Fix this from bridge/test/util.clj
(comment (defn with-database [db-name schema]
  (fn [test-fn]
    (let [uri    (str "datomic:mem://" db-name)
          _      (d/delete-database uri)
          _      (d/create-database uri)
          conn   (d/connect uri)
          _      @(d/transact conn schema)
          result (datomic/with-datomic-mode :peer
                   (test-fn))]
      (d/release conn)
      (d/delete-database uri)
      result))))
