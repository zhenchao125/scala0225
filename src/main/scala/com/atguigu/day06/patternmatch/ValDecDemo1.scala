package com.atguigu.day06.patternmatch

object ValDecDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = Array(30, 50, 70, 60, 10, 20)
        
        val Array(x, _, y, _*) = list1
        println(x, y)
    
        println(BigInt(10) /% 3)
    }
}
