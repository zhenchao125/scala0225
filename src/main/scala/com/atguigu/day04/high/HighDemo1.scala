package com.atguigu.day04.high

/**
  * Author lzc
  * Date 2019-07-01 15:17
  */
object HighDemo1 {
    def main(args: Array[String]): Unit = {
        val f = foo _
        
        f(10)
        foo(10)
        
    }
    
    def foo(a:Int) = {
        println(a)
    }
}

/*
对待函数:
    1. 定义函数
    2. 调用函数
    3. 把他作为值来对待


1. 把函数作为值来处理
  a:存在变量中
  b:作为参数来传递


 */