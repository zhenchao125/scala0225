package com.atguigu.day01.vardemo

object VarDemo1 {
    def main(args: Array[String]): Unit = {
        var a: Int = 10
        a = 100
        var b = 20
        
        var c: Int = 30
        
        val aa: Int = 20
        val bb = 30
    
        println(foo())
        
    }
    
    def foo() : Unit = {
    
    }
}
/*
变量
    java:
        类型  变量名;
        变量名 = 赋值
        
    scala:
    
        声明的同时必须初始化
    

常量
    java:
       final 类型  变量名 = 初始化值
       
       
    scala:
        val
        
尽量用常量, 除非这个变量需要更改采用变量

 */