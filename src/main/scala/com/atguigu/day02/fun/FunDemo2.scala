package com.atguigu.day02.fun

object FunDemo2 {
    def main(args: Array[String]): Unit = {
        
        println(add(b = 1, c = 2))
        println(add(c = 1, b = 2))
        println(add(c = 1, b = 2, a = 100))
        
        
        
    }
    
    def add(a: Int = 1000, b: Int, c: Int) = a + b + c
    
}

/*
1. 参数的默认值

2. 命名参数(默认是位置参数)


 */
