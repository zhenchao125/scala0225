package com.atguigu.day02.fun

object FunDemo3 {
    def main(args: Array[String]): Unit = {
        /*add(1)
        add(1,2)
        add(1,2,3)*/
        var arr = Array(10,20,30)
        // 把数组展开
        add(arr:_*)
        
        foo("abc":_*)
    }
    
    // 声明参数接收可变参数
    def add(a: Int*) = {
        for (elem <- a) {
            println(elem)
        }
    }
    
    def foo(a: Char*) ={
    
    }
}
/*
1. 函数的形参默认都是常量

2. java jdk 1.5 可变参数

 */