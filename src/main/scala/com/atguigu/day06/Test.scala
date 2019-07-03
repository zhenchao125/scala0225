package com.atguigu.day06

object Test {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20, "AAA", true)
        
        list1.foreach{
            case a:Int =>
                println(a + 1)
            case s: String =>
                println(s)
            case b:Boolean =>
                println(!b)
        }
    }
}
/*
码奴
码农
    面向百度
程序员
    面向工资
工程师
    年薪
架构师
    股份
 */