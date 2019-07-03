package com.atguigu.day06

object PreOptDemo {
    def main(args: Array[String]): Unit = {
        // 0000 0001
        // 1111 1110
        val myInt = new MyInt(1)
        println(-myInt)
        println(+myInt)
        println(~myInt)
    }
}

class MyInt(val n:Int){
    
    // 前置运算符:  运算符的约定
    def unary_- = -n
    def unary_+ = n
    def unary_~ = ~n
    
    
}