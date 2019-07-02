package com.atguigu.day04.map

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-07-01 14:14
  */
object MapDeme4 {
    def main(args: Array[String]): Unit = {
        
        var map1 = mutable.Map("a" -> 97, "b" -> 98)
        
        map1.getOrElseUpdate("c", 100)
        println(map1)
    }
}

/*
可变map和不可变map

1. map(key)  Key不存在直接抛出异常


Option:
    java NullPointException
    
    Option
 */