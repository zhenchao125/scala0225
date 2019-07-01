package com.atguigu.day04.list

/**
  * Author lzc
  * Date 2019-07-01 11:31
  */
object ListDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(10, 20, 30, 40)
    
    
        println(100 :: list1)  // 100 :+ list1
        
        /*val list2: List[Int] = list1 :+ 100
        
        
        
        println(list1)
        println(list2)*/
        
        
    }
}

/*
不可变的List
    
    
    :: 是不可变 List 专有的
    
    ::: 两个list相加
    
可变:


 */
