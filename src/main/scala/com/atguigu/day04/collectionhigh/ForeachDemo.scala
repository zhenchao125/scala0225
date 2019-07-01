package com.atguigu.day04.collectionhigh

object ForeachDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        // 系统提供的高阶函数来做业务 (高阶算子)
        // 1. 遍历每个元素
        list1.foreach(x => println(x))
        list1.foreach(println) //  list1.foreach(println(x => x)
        list1.foreach(println(_)) //  部分应用函数
//        list1.foreach(println(_ + 1)) // list1.foreach(println(x => x + 1))
    
    
    }
}
