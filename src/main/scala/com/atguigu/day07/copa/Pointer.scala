package com.atguigu.day07.copa

object Printer {
    def main(args: Array[String]): Unit = {
    
    }
}

class Printer[-A] {
    
    
    // 编译失败: contravariant type A occurs in covariant position in type (n: A)A of method print
    /*def print(n: A): A = {
        println(n)
        n
       
    }*/
    
    // 使用上界解决协变点的问题
    def print[B <: A](n: B): B = {
        println(n)
        n
    }
}


/*class Printer[+A] {
    // 编译失败: covariant type A occurs in contravariant position in type A of value n
    // 参数的类型是逆变点, 所以不能使用协变类型
    def print(n: A): Unit = {
        println(n)
    }
    
    // 使用下界来解决  逆变点的问题
    def print[U >: A](n: U): Unit = {
        println(n)
    }
    
}*/

