package com.atguigu.day03.imp

object ImpDemo1 {
    // 2 4 for -> four -> 4   i18n 国际化
    implicit def double2Int(d: Double) = d.toInt
    
    def main(args: Array[String]): Unit = {
        
        
        val n: Int = 10.2
        println(n)
        val n1:Int = 11.3
        println(n1)
        
    }
}

/*
隐式转换:

1. 隐式转换函数:
    implicit def double2Int(d: Double) = d.toInt
    
    只看参数类型和返回值类型, 不关注函数名


 */