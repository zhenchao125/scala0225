package com.atguigu.day03.traitdemo

object QiantaoDemo {
    def main(args: Array[String]): Unit = {
        val outer1 = new Outer
        val inner1 = new outer1.Inner
    
        val outer2 = new Outer
        val inner2 = new outer2.Inner
        
        inner2.foo(inner1)
    }
}

class Outer{
    val a = 10
    
    class Inner{
        val a = 20
        // 类型投影: 只关注类型, 不关注外部类的对象是谁
        def foo(inner: Outer#Inner) = {
//            println(Outer.this.a)
            println("aaa")
        }
    }
}

