package com.atguigu.day01.ifdemo

/**
  * Author lzc
  * Date 2019-06-26 15:25
  */
object IfDemo1 {
    def main(args: Array[String]): Unit = {
        
        val d = -10
        val v = if (d >= 0) {
            Math.sqrt(d)
        } else {
            throw new IllegalArgumentException
        }
    
        println(v)
    }
}
