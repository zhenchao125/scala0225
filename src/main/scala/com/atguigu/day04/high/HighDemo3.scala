package com.atguigu.day04.high

/**
  * Author lzc
  * Date 2019-07-01 15:17
  */
object HighDemo3 {
    def main(args: Array[String]): Unit = {
        val intToInt: Int => Int = getFunction()
        //
        println(intToInt(20))
        
    }
    
    // 高阶函数
    def getFunction() = {
        var temp = 20
        temp = 100
        def foo(a:Int) = a + temp  // Int => Int
        foo _
    }
}

/*

闭包: closure

 如果一个函数他访问了外部的局部变量, 则这个函数就是一个闭包
 
他可以持有外部的局部变量的值, 使之不会被销毁

 */