package com.atguigu.day05.collectionhigh

import scala.io.Source

/**
  * Author lzc
  * Date 2019-07-02 15:34
  */
object GroupByDemo1 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 5, 7, 6, 10, 2)
        
        val map = list1.groupBy(x => if (x % 2 == 0) "偶数" else "奇数")
        val map1: Map[String, Int] = map.map(kv => (kv._1, kv._2.size))
        println(map1)*/
        
        // wordcount
        
        //        val lines = List("hello wold", "a b c", "hello world", "ab    a \t  a")
        
        val lines = Source.fromFile("C:\\Users\\lzc\\Desktop\\class_code\\2019_02_25\\01_scala\\scala0225\\src\\main\\scala\\com\\atguigu\\day05\\collectionhigh\\GroupByDemo1.scala")
            .getLines()
        val words = lines.flatMap(x => x.split("\\W+"))
        
        val wordLists: Map[String, List[String]] = words.toList.groupBy(x => x)
        val wordCount: Map[String, Int] = wordLists.map(kv => (kv._1, kv._2.length))
        println(wordCount.toList)
    }
}

/*
分组:
 

 */