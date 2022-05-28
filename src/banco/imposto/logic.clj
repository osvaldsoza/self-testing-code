(ns banco.imposto.logic)

;;funcao privada
(defn- esta-na-faixa-de-isencao?
  [valor]
  (let [teto-salario 1000]
    (< valor teto-salario)))

(defn imposto-retido-fonte
  [valor]
  (let [taxa 0.1]
    (if (esta-na-faixa-de-isencao? valor)
      0
      (* valor taxa))))