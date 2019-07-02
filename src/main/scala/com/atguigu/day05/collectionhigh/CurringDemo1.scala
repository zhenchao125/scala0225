package com.atguigu.day05.collectionhigh

/**
  * Author lzc
  * Date 2019-07-02 11:37
  */
object CurringDemo1 {
    implicit val n = 2
    def main(args: Array[String]): Unit = {
        /*val f: Int => Int = add(2)
        println(f(3))
        println(f(4))*/
        // add(2, 3)
        // add(2, 4)
        
//        println(add(2)(3))
//        println(add(2)(4))
        println(add(3))
        println(add(4))
    }
    
    // 把一个参数列表的多个参数转换成多个参数列表的过程, 就叫柯里化
    def add(a: Int)(implicit b: Int) = {
        a + b
    }
    
    /*def add(a: Int) = {
        (b: Int) => a + b
    }*/
}
