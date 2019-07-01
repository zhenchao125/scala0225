package com.atguigu.day04.stack

import scala.collection.mutable

object QueueDemo {
    def main(args: Array[String]): Unit = {
        val queue = mutable.Queue(10, 20, 30)
        queue.enqueue(40)
        queue.dequeue()
        println(queue)
    }
}
