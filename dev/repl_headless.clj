(ns repl-headless
  (:require [cider-nrepl.main :as nrepl]))

(defn -main []
  (nrepl/init ["cider.nrepl/cider-middleware"
               "cemerick.piggieback/wrap-cljs-repl"]))