package com.atguigu.day06.patternmatch

/**
  * Author lzc
  * Date 2019-07-03 09:26
  */
object ArrayMatch1 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(1, 200,1,1,1,1,1)
        
        arr1 match {
//            case Array(30, 50, 70) => println("Array(30, 50, 70)")
//            case Array(_, 50, 70) => println("Array(_, 50, 70)")
//            case Array(_, _, 70) => println("Array(_, _, 70)")
//            case Array(one, _, 70) => println(s"Array($one, _, 70)")
//            case Array(200, _*) => println("Array(200, _*)")
            case Array(_, 200, rest@_*) => println("200, rest@_*" + rest)
            
            case _ => println("什么也没有匹配到")
        }
    }
}

/*
匹配数组中的内容

数组匹配的本质: 就是把数组的内容给匹配出来
 */