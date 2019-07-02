package com.atguigu.day05.collectionhigh

object IteratorDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        val iterator: Iterator[Int] = list1.toIterator
        while (iterator.hasNext) {
            println(iterator.next())
        }
        
    }
}
