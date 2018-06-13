(ns data-paper.data.admin
  (:require [data-paper.data :as d]
            [data-paper.data.schema.collection :as collection]))


(defn setup-db []
  "Aggregates & transacts all schema functions."
  (d/transact! collection/schema))
