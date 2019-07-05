package com.atguigu.day07.generic

object ContextBound {
    def main(args: Array[String]): Unit = {
        // Ordering[Int]  === Ordering.Int     java: Comparator 第三方的比较器
        /*val pair = new Pair[Int](10, 20)
        println(pair.max)*/
    
        println(max(3, 10))
    }
    def max[T: Ordering](a: T, b: T)(implicit ord: Ordering[T]) = {
        if (ord.gt(a, b)) a else b
    }
    
}

// 上下文界定
// 有一个隐式值 Ordering[T]  Ordering[Int]
/*
class Pair[T: Ordering](a: T, b: T) {
    def max(implicit ord: Ordering[T]) = if (ord.gt(a, b)) a else b
}
*/

/*
1. 上界    T <: Any   (T extends Any)

2. 下界    T >: Any   (T super Any)

3. 视图界定  T <% Comparable[T]
    有一个隐式转换 T -> Comparable[T]
    
4. 上下文界定  T: Ordering
    表示有一个隐式值 Ordering[T]


 */