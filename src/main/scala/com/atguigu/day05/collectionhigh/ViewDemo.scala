package com.atguigu.day05.collectionhigh

import scala.collection.SeqView

object ViewDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        val view: AnyRef with SeqView[Int, List[Int]] = list1.view
        println(view.head)
        println(view.tail.head)
    }
}
