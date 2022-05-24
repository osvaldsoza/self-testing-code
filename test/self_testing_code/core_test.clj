(ns self-testing-code.core-test
  (:require [clojure.test :refer :all]
            [self-testing-code.core :refer :all]))

(deftest calcular-taxa-de-entrega-test
  (testing "dado um valor abaixo de 100 reais, a taxa de entrega deve ser de 15 reais"
    (is (= 15 (taxa-de-entrega 1)))
    (is (= 15 (taxa-de-entrega 100))))

  (testing "dado um valor entre 100 e 200 reais, a taxa de entrega deve ser 5 reais"
    (is (= 5 (taxa-de-entrega 100.01)))
    (is (= 5 (taxa-de-entrega 200))))

  (testing "dado um valor maior que 200, taxa de entrega deve ser 0 reais"
    (is (= 0 (taxa-de-entrega 200.1)))))

