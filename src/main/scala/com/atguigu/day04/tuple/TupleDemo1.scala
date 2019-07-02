package com.atguigu.day04.tuple

object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        val t2: Tuple2[Int, String] = Tuple2(10, "abc")
    
        println(t2._1)
        println(t2._2)
        
        Tuple4(10, 20, true, "aaa")
        
    }
    
    def foo = {
        Tuple4(1, 2, "a", "b")
    }
}
