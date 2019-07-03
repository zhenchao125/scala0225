package com.atguigu.day06.homework

import scala.collection.immutable

/**
  * Author lzc
  * Date 2019-07-03 08:11
  */
object Homework1 {
    def main(args: Array[String]): Unit = {
        println(indexes("Helloee"))
    }
    
    def indexes(s: String) = {
        val charToTuples = s.zipWithIndex.groupBy(_._1)
        charToTuples.map(kv => (kv._1, kv._2.map(_._2).toList))
    }
}

/*
3. 编写一个函数, 接收一个字符串, 返回一个 Map.
    比如: indexes("Helloee")

   返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标
   
 倒推法:
=> s.zipwitchIndex   List[(char, Index)]
=> Map[(char, List(char, Index))]   map

Map(H->{0}, e -> {1, 5, 6}, ...)
 */