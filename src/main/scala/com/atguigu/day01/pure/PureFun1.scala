package com.atguigu.day01.pure

/**
  * Author lzc
  * Date 2019-06-26 16:43
  */
object PureFun1 {
    def main(args: Array[String]): Unit = {
//        println(add(10, 20)) // 130
//        c = 200
//        println(add(10, 20))
        
        val c = 200
        println(c)
        
        add(10, 20)
        PureFun1.add(10, 20)
    }
    
    var c = 100
    
    def add(a: Int, b: Int) ={
        
        a + b
    }
}
