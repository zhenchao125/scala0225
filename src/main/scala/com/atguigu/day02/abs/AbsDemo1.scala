package com.atguigu.day02.abs

object AbsDemo1 {
    def main(args: Array[String]): Unit = {
    
    }
}

abstract class Human {
    def say(): Int
    
    var a: Int
    
    var b :Int = 0
    val c: Int
}


class Person extends Human{
    override def say(): Int = ???
    
    override var a: Int = _
    override val c: Int = 1
}

/*

java: 普通类有哪些成员:
1. 属性
2. 方法
3. 构造代码块
4. 构造器
5. 内部类
6. 静态代码块


创建子类对象:
父类的静态代码块 -> 子类的静态代码块 -> 父类的构造代码块 -> 父类的构造器 -> 子类的构造代码块 -> 子类的构造器


scala 普通 类:
    代码(主构造的代码)
    属性
    方法
    
 scala抽象类:
    普通类有的, 抽象类都可以有
    抽象方法
    抽象字段(抽象属性)
 */