(ns data-paper.data.edit-test
  (:require [data-paper.data :as data]
            [clojure.test :refer [deftest]]
            [data-paper.data.schema.collection :as collection]))

(data/transact! data/conn collection/schema)

;(run-tests)


