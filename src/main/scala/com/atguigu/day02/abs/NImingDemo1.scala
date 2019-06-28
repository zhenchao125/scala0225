package com.atguigu.day02.abs

object NImingDemo1 {
    def main(args: Array[String]): Unit = {
        val a: A = new A {
            override def foo(): Unit = println("匿名内部类")
        }
        a.foo()
    }
}

abstract class A {
    def foo(): Unit
}
