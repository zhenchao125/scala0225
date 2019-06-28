package com.atguigu.day01.operation

/**
  * Author lzc
  * Date 2019-06-26 14:39
  */
object OperationDemo1 {
    def main(args: Array[String]): Unit = {
        var a = 10
        val b = 20
        val c = a + b
        val d = a + b
        println(c)
        println(d)
        
        a += 1  // java:  a++
        println(a)
        
        println(10 % -3)
        println(-10 % 3)
        
    }
}
/*
运算符:
    在scala中没有真正的运算符, 只有方法调用
    
    调用方法的时候, . 可以省略点, 如果参数只有一个或者没有, 圆括号也可以省略
    


 */
