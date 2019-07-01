package com.atguigu.day04.map

/**
  * Author lzc
  * Date 2019-07-01 14:14
  */
object MapDemo2 {
    def main(args: Array[String]): Unit = {
        
        var map = Map("a" -> 97, "b" -> 98)
        println(map.getOrElse("a", 99))
        // 添加键值对
        map += "c" -> 99
        println(map)
        
        // map遍历: 每个元素其实是 元组
        for (kv <- map) {
            println(kv._1)  // key
            println(kv._2)  // value
        }
        
        println("--------------------")
        for((key, value)  <- map){
            println(key, value)
        }
        println("--------------------")
        for((key, value)  <- map if value == 97){
            println(key, value)
        }
    
        println("--------------------")
        for((key, 97)  <- map){
            println(key)
        }
    
        println("--------------------")
        for (key <- map.keys) {
            println(key)
        }
        println("--------------------")
        for (value <- map.values) {
            println(value)
        }
    }
}

/*
可变map和不可变map

1. map(key)  Key不存在直接抛出异常


Option:
    java NullPointException
    
    Option
 */