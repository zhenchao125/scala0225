package com.atguigu.day04.arrary

import scala.collection.mutable.ArrayBuffer

object ArrayDemo2 {
    def main(args: Array[String]): Unit = {
        val arr1 = ArrayBuffer(30, 50, 70, 60, 10, 20)
        println(arr1.sum)
        println(arr1.max)
        println(arr1.min)
    
        println(arr1.mkString)
        println(arr1.mkString(",    "))
        println(arr1)
    
//        println(arr1.sorted)
//        println(arr1.sortWith(_ > _))  // lambda
    }
}
