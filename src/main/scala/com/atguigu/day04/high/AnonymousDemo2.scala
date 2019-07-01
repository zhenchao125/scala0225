package com.atguigu.day04.high

/**
  * Author lzc
  * Date 2019-07-01 15:17
  */
object AnonymousDemo2 {
    def main(args: Array[String]): Unit = {
        // 1. 匿名函数作为值赋值给变量
        
        val foo = (a: Int, b: Int) => {
            a + b
        }
        
        // 2. 作为实参传递给高阶函数
        travelArray(Array(10, 20), (ele) => println(ele))
        // 只有一个形参的时候才能省略圆括号, 其他情况都不能省
        travelArray(Array(10, 20), ele => println(ele))
        travelArray(Array(10, 20), println(_))
        
        //
        travelArray(Array(10, 20), println)
        
    }
    
    
    def travelArray(arr: Array[Int], action: Int => Unit) = {
        for (ele <- arr) {
            action(ele)
        }
    }
    
}

/*
匿名函数

1. 作为实参来传递给高阶函数
2. 作为返回值返回给调用者
3. 作为值赋值给变量
 */