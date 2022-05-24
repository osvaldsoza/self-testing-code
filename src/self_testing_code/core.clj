(ns self-testing-code.core)

"(defn taxa-de-entrega
  [valor-da-compra]
  (let [taxa-15 15
        taxa-2 5
        taxa-0 0]
    (if (<= valor-da-compra 100)
      (* valor-da-compra taxa-15)
      (if (< valor-da-compra 200)
        (* valor-da-compra taxa-2)
        (* valor-da-compra taxa-0)))))"
(defn taxa-de-entrega
  [valor-da-compra]
  (if (<= valor-da-compra 100)
    15
    (if (<= valor-da-compra 200)
      5
      0)))