package com.atguigu.day03.homework

object Homework4 {
    def main(args: Array[String]): Unit = {
        val rectangle = new Rectangle(new Point(1, 1), new Point(20, -100))
        println(rectangle.centerPoint)
        println(rectangle.area)
    }
}

abstract class Shape {
    def centerPoint: Point
    def area: Double
}

class Circle(val center: Point, val r: Double) extends Shape {
    override def centerPoint: Point = center
    
    def area = math.Pi * r * r
}

class Rectangle(leftTop: Point, rightBottom: Point) extends Shape {
    override def centerPoint: Point = {
        new Point((rightBottom.x + leftTop.x) / 2, (rightBottom.y + leftTop.y) / 2)
    }
    
    override def area: Double = ((rightBottom.x - leftTop.x) * (rightBottom.y - leftTop.y)).abs
}


/*
5. 定义一个抽象类 Shape，一个抽象方法 centerPoint，以及该抽象类的子类 Rectangle 和 Circle。
为子类提供合适的构造器，并重写centerPoint方法, 并提供计算面积的方法 (根据需要添加相应的属性)

 */