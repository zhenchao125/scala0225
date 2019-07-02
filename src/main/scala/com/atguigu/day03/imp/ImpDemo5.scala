package com.atguigu.day03.imp

object ImpDemo5 {
    implicit val a = 20
    
    def main(args: Array[String]): Unit = {
        //        foo  // 使用隐式值
        //        foo() // 使用默认值
        
        val c = 10
        val b: Double = c  //Int
        println(b)
        
    }
    
    def foo(implicit n: Int = 200) = println(n)
    
    
}

/*

隐式参数和隐式值


柯里化



 */

