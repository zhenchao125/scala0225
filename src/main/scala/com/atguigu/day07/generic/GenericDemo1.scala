package com.atguigu.day07.generic

object GenericDemo1 {
    def main(args: Array[String]): Unit = {
        val point1 = new Point[Int](10, 20)
        val point2 = new Point(10.2, 20)
        
        point1.foo(100)
        point2.foo(100.2)
        
    }
}


class Point[T](val x: T, val y: T) {
    def foo(a: T) = a
    
    def add[A](a: A) =  a
    
}

/*

1. 泛型类
    定义类的时候, 指明参数化的类型
    
    这个泛型在整个类的内部都可以使用

2. 泛型函数
    
    定义函数的时候指明的参数化的类型
    
    这个泛型只能在这个函数内使用


 */
