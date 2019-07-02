package com.atguigu.day04.high

/**
  * Author lzc
  * Date 2019-07-01 15:17
  */
object AnonymousDemo1 {
    def main(args: Array[String]): Unit = {
        val intToInt: Int => Int = getFunction()
        //
        println(intToInt(20))
        
    }
    
    // 高阶函数
    def getFunction() = {
        var temp = 20
        temp = 100
        (a:Int) => a + temp  // Int => Int
    }
}
/*
匿名函数

1. 作为实参来传递给高阶函数
2. 作为返回值返回给调用者
3. 作为值赋值给变量
 */