package com.atguigu.day03.homework

/**
  * Author lzc
  * Date 2019-06-28 18:31
  */
object Homework3 {
    def main(args: Array[String]): Unit = {
        
    }
}

class Point(val x: Double, val y: Double) {
    def distance(other: Point) =
        math.sqrt(math.pow(this.x - other.x, 2) + math.pow(this.y - other.y, 2))
    
    override def toString: String = s"x = $x, y = $y"
}

class LabeledPoint(val label: String, override val x:Double, override val y:Double) extends Point(x, y)

/*
4. 设计一个 Point 类，其x和y坐标可以通过构造器提供。
     提供一个子类 LabeledPoint，其构造器接受一个标签值和x,y坐标,
     比如:new LabeledPoint(“Black Thursday”,1929,230.07)

 */