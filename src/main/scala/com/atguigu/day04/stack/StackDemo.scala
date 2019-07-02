package com.atguigu.day04.stack

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-07-01 14:03
  */
object StackDemo {
    def main(args: Array[String]): Unit = {
        var stack = mutable.Stack(10, 20, 30, 40)
        
        stack.push(50)
        stack.push(60)
//        val ele: Int = stack.pop()
//        println(ele)
        
        println(stack)
    }
}

