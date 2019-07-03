package com.atguigu.day06.homework

import scala.io.Source

/**
  * Author lzc
  * Date 2019-07-03 08:11
  */
object Homework4 {
    def main(args: Array[String]): Unit = {
        val lines = Source.fromFile("C:\\Users\\lzc\\Desktop\\class_code\\2019_02_25\\01_scala\\scala0225\\src\\main\\scala\\com\\atguigu\\day06\\homework\\Homework4.scala")
            
            .getLines().toList
        val wordCountMap: Map[String, Int] =
            lines.flatMap(_.split("\\W+"))
                .groupBy(word => word)
                .map(wordWordLit => (wordWordLit._1, wordWordLit._2.size))
        val wordCountList: List[(String, Int)] = wordCountMap.toList
        
        val wordCountListSorted = wordCountList
            .sortBy(wordCount => (wordCount._2, wordCount._1.length))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.Int))
        println(wordCountListSorted)
        
    }
}

/*
1. 对前面 wordcount 的结果, 按照单例的个数降序排列,如果个数相同按照单词的长度升序排列
 */