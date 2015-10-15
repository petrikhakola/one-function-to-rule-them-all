(ns one-function-to-rule-them-all)

(defn concat-elements [a-seq]
  (reduce concat a-seq))

(defn str-cat [a-seq]
  (cond
   (empty? a-seq) ""
   :else (reduce str (map str (interpose " " a-seq)))))

(defn my-interpose [x a-seq]
  (rest (reduce (fn [seq item] (conj seq x item)) [] a-seq)))

(defn my-count [a-seq]
  (reduce (fn [a] (inc a)) 0 a-seq))

(defn my-reverse [a-seq]
  (reduce (fn [seq item] (cons item seq)) [] a-seq))

(defn min-max-element [a-seq]
  (reduce (fn [[vmin vmax] val] [(min vmin val) (max vmax val)]) 
          [10 0] a-seq))

(defn insert [sorted-seq n]
  (let [ pred (fn [x] (<= x n)) ]
    (concat (take-while pred sorted-seq) [n] (drop-while pred sorted-seq))))

(defn insertion-sort [a-seq]
  (reduce insert [] a-seq))

; reuse toggle from previous exercise
(defn toggle [a-set elem]
  (if (contains? a-set elem)
    (disj a-set elem)
    (conj a-set elem)))

(defn parity [a-seq]
  (reduce toggle #{} a-seq))

(defn minus 
  ([x] (- x))
  ([x y] (- x y)))

(defn count-params [& x]
  (count x))

(defn my-* 
  ([] 1)
  ([x] x)
  ([x y] (* x y))
  ([x y & more] (reduce (fn [acc i] (* acc i)) (* x y) more)))

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
