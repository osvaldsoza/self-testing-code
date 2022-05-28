(ns banco.imposto.logic)


(defn imposto-retido-fonte
  [valor]
  (if (< valor 1000)
    0
    (* valor 0.1)))
