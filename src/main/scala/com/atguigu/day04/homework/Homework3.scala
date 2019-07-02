package com.atguigu.day04.homework


object Homework3 {
    def main(args: Array[String]): Unit = {
        
        val richInt: RichInt = 120
        println(richInt +% 10)
    }
}


/*
3. 定义一个操作符 +% , 可以将一个给定的百分百添加到某个值
    比如 120 +% 10  应该得到 132
 */
