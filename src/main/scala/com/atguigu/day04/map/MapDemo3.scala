package com.atguigu.day04.map

/**
  * Author lzc
  * Date 2019-07-01 14:14
  */
object MapDemo3 {
    def main(args: Array[String]): Unit = {
        
        var map1 = Map("a" -> 97, "b" -> 98)
        var map2 = Map("a" -> 197, "c" -> 98)
        
        val map3: Map[String, Int] = map1 ++ map2
        println(map3)
        
    }
}

/*
可变map和不可变map

1. map(key)  Key不存在直接抛出异常


Option:
    java NullPointException
    
    Option
 */