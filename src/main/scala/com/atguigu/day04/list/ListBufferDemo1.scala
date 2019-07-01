package com.atguigu.day04.list

import scala.collection.mutable

object ListBufferDemo1 {
    def main(args: Array[String]): Unit = {
        
        val lb = mutable.ListBuffer(10, 20, 30)
        println(lb)
        lb += 100
        100 +=: lb
    
        lb ++= List(10, 20, 30)
        println(lb)
    }
}
