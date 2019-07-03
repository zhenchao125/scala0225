package com.atguigu.day06.homework

/**
  * Author lzc
  * Date 2019-07-03 08:11
  */
object Homework2 {
    def main(args: Array[String]): Unit = {
        println(myMkString(Array(1, 2, 3, 4), "????"))
    }
    
    def myMkString(arr: Array[Int], seperator: String): String ={
//        arr.foldLeft("")((last, ele) => last + seperator + ele).substring(seperator.length)
        arr.foldLeft("")((last, ele) => {
//            val temp = if(last.length == 0) "" else seperator
            last + (if(last.length == 0) "" else seperator) + ele
        })
    }
}
/*
4. 实现一个函数，作用与mkString相同，使用foldLeft

 */
