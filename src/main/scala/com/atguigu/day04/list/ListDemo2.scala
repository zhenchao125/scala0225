package com.atguigu.day04.list

/**
  * Author lzc
  * Date 2019-07-01 11:31
  */
object ListDemo2 {
    def main(args: Array[String]): Unit = {
//        val list1 = List(30, 50, 70, 60, 10, 20)
//        val list2 = List(3, 5, 7, 6, 1, 2)
//
//        println(list1 ::: list2)  // list2.:::(list1)
    
        println(1 :: 2 :: 3 :: List[Nothing]())
        println(1 :: 2 :: 3 :: Nil)  // Nil 空 List
    }
}

/*
不可变的List
    
    
    :: 是不可变 List 专有的
    
    ::: 两个list相加
    
可变:


 */
