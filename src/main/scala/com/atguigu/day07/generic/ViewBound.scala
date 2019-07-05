package com.atguigu.day07.generic

object ViewBound {
    def main(args: Array[String]): Unit = {
        println(max(1, 3))
        
    }
    // <% 视图界定:  存在一个隐式的转换    把 T类型转换成 Ordered 类型
    // 视图界定可以看成是一种隐式转换
    def max[T <% Ordered[T]](a: T, b: T) = {
        if (a > b) a else b
    }
}
