package com.atguigu.day02.extendsdemo

/**
  * Author lzc
  * Date 2019-06-28 15:25
  */
object ExtendsDemo1 {
    def main(args: Array[String]): Unit = {
        val student = new Student("lisi")
//        println(student.name)
        student.say()
//        student.eat()
        
    }
}

class Person(val name: String) {
    
    protected def say() = {
        println("Person ... say")
    }
}

class Student(override val name: String) extends Person(name) {
    override def say() = {
        super.say()
        println("Studnet ... say")
    }
    
    /*def eat() = {
        
        val abc = new Person("abc")
        abc.say()  //错误, 不允许, 只允许 super.say()的方式访问
    }*/
}


/*
继承的特点:

1. 关键字用 extends

2. 单继承

3. 只能父类的非私有成员


----

只有子类的主构造才能调用父类的主构造

1. 子类的方法或者属性进行覆写的时候, 必须添加 override关键字





 */