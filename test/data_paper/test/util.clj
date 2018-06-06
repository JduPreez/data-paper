(ns data-paper.test.util
  (:require [datomic.api :as d]
            [datomic.client.api :as dc]))

(def x "2")

(def cfg {:server-type :peer-server
          :access-key  "accesskey"
          :secret      "secret"
          :endpoint    "localhost:8998"})

(defn conn [db-nam]
  (d/connect (str "datomic:mem://" db-name)))

(defn db [db-name]
  (d/db (conn db-name)))
