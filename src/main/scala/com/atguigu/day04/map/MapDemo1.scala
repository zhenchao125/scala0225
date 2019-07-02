package com.atguigu.day04.map

/**
  * Author lzc
  * Date 2019-07-01 14:14
  */
object MapDemo1 {
    def main(args: Array[String]): Unit = {
        var map = Map(("a", 97), ("b", 98))
        // 根据key获取value
        println(map("a"))
        println(map("b"))
        /*val opt: Option[Int] = map.get("a")
        
        if (!opt.isEmpty) {
            println(opt.get)
        }*/
//        println(map.getOrElse("c", 99))
    
    
    }
}

/*
可变map和不可变map

1. map(key)  Key不存在直接抛出异常


Option:
    java NullPointException
    
    Option
 */