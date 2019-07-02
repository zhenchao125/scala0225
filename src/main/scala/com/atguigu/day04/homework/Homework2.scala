package com.atguigu.day04.homework

/**
  * Author lzc
  * Date 2019-07-01 08:19
  */
object Homework2 {
    def main(args: Array[String]): Unit = {
        println(10!)
    }
    
    implicit class RichInt(val n: Int) {
        def ! = recursive(n)
        
        def recursive(num: Int) : Int ={
            if(num == 1) 1
            else num * recursive(num - 1)
        }
    }
}


/*
2. 定义一个 ! 操作符, 计算某个整数的阶乘. 比如 5! 应该得到 120   // 5 !
 */