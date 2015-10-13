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
  (reduce (fn [[vmin vmax] val] [(min vmin val) (max vmax val)]) [100 -1] a-seq))

(defn insert [sorted-seq n]
  [:-])

(defn insertion-sort [a-seq]
  [:-])

(defn parity [a-seq]
  [:-])

(defn minus 
  ([x] (- x))
  ([x y] (- x y)))

(defn count-params [& x]
  (count x))

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])
