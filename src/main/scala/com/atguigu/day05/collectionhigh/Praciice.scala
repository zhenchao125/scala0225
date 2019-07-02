package com.atguigu.day05.collectionhigh

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-07-02 10:26
  */
object Praciice {
    def main(args: Array[String]): Unit = {
        val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
        
        /*val arr: ArrayBuffer[Char] = sentence.foldLeft(ArrayBuffer[Char]())((arr, c) => {
            arr += c
            arr
        })
        println(arr)*/
        
        //        val list: List[Char] = sentence.foldLeft(List[Char]())((list, c) => c::list).reverse
        //        val list: List[Char] = sentence.foldLeft(List[Char]())((list, c) => list :+ c)
        //        println(list)
        
        // 统计次数  Map[ A -> 10, B -> 3, ....]
        //        val map: Map[Char, Long] = sentence.foldLeft(Map[Char, Long]())((map, c) => {
        //            map + (c -> (map.getOrElse(c, 0L) + 1L))
        //        })
        
        
        val map: mutable.Map[Char, Long] = sentence.foldLeft(mutable.Map[Char, Long]())((map, c) => {
            map += c -> (map.getOrElse(c, 0L) + 1L)
        })
        println(map)
    }
}
