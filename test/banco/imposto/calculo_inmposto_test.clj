(ns banco.imposto.calculo-inmposto-test
  (:require [clojure.test :refer :all]
            [banco.imposto.logic :refer :all]))


(deftest imposto-retido-fonte-test
  (testing "Dado um valor abaixo de 1000 reais, não deve ter imposto retido"
    (is (= 0 (imposto-retido-fonte 1)))
    (is (= 0 (imposto-retido-fonte 999.99))))
  (testing "Dado um valor mairo que 1000 reais, deve calcular imposto"
    (is (= 100.5 (imposto-retido-fonte 1005)))))
