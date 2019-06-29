package com.atguigu.day03.single

import scala.collection.mutable

object Marker {
    val map = mutable.Map[String, Marker](
        "red" -> new Marker("red"),
        "green" -> new Marker("gren"))
    
    
    def getMarker(color: String) = map.getOrElseUpdate(color, new Marker(color))
    
    
    def main(args: Array[String]): Unit = {
        println(getMarker("red"))
        println(getMarker("red"))
        println(getMarker("red"))
        println(getMarker("red"))
        println(getMarker("yellow"))
        println(getMarker("yellow"))
    }
}

// 让主构造私有
class Marker private(color: String) {
    
    println("create   " + color)
    
    override def toString: String = color
    
    def foo = {}
}

/*
1. 如果一个object和一个class的名字一样,
我们称这个object 是这个class的伴生对象, 称这个class是这个object的伴生类

2. 伴生类和伴生对象必须在同一个文件中出现

3. 伴生类和伴生对象可以互相访问对方的私有成员

4. 如果只有伴生对象没有伴生类, 这个时候我们称这个对象叫独立对象或者单例对象
 */