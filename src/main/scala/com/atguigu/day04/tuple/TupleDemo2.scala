package com.atguigu.day04.tuple

object TupleDemo2 {
    def main(args: Array[String]): Unit = {
       val t2: Tuple2[Int, String] = (1, "abc")
      
       val tt2:(Int, String) = (1, "abc")
        // _1  _2 ...
        
        // 先把元组中的每个元素生产一个迭代器
        val iterator: Iterator[Any] = tt2.productIterator
        for (elem <- iterator) {
            println(elem)
        }
        
        // 10 / 3  3...1
        
//        val tuple: (Int, Int) = /%(10, 3)
//        println(tuple._2)
        
        val (a, _): (Int, Int) = /%(10, 3)
        println(a)
//        println(b)
    }
    
    def /%(m: Int, n:Int) = {
        (m / n, m % n)
    }
    
    
}
/*
1. 不可变
2. 个数有限
3. 一般每个元素的类型不一致

 */
