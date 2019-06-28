package com.atguigu.day02.obj

import com.sun.org.apache.bcel.internal.generic.NEW

import scala.beans.BeanProperty

/**
  * Author lzc
  * Date 2019-06-28 11:01
  */
object ObjDemo2 {
    def main(args: Array[String]): Unit = {
        
//        val p1 = new Person(30)
//        println(p1.name)   // name()
//        println(p1.age)
        
        new Person("zs", 30)
    }
}

class Person(val name: String){
    var age: Int = _
    
    def this(age: Int) {
        this("zs")
        this.age = age
    }
    def this(name:String, age: Int) ={
        this(age)
        println("2个参数的构造")
    }
    
}


/*
数值型:  0 0.0
boolean :false
引用: null


1. 辅助构造他的首行必须是调用主构造函数

2. 辅助构造函数之间是有顺序要求的, 后面的能调用前面

 */