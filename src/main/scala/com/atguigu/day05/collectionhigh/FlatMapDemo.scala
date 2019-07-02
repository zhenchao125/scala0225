package com.atguigu.day05.collectionhigh

/**
  * Author lzc
  * Date 2019-07-02 09:04
  */
object FlatMapDemo {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(List(1, 2), List(10, 20, 30), List(100))
        
        val list2: List[Int] = list1.flatMap(x => x)
    
        println(list2)*/
        
        /*val list1 = List("hello", "abc", "atguigu")
        // list('h', 'e', 'l'...)
//        val chars: List[Char] = list1.flatMap(s => s)
        val chars = list1.flatMap(s => s)
        println(chars)*/
        
        val list1 = List(30, 50, 70, 60, 10, 20)
        // List(30, 900, 27000, 50, 2500, 125000,....)
        val list2: List[Int] = list1.flatMap(n => Array(n, n * n, n *n * n))
        println(list2)
        
    }
}
