package com.atguigu.day06.abs

/**
  * Author lzc
  * Date 2019-07-03 15:11
  */
object MyWhileDemo {
    def main(args: Array[String]): Unit = {
        var i = 0
        mywhile(i < 100) {
            println(i)
            i += 1
        }
    }
    
    def mywhile(condition: => Boolean)(action: => Unit): Unit = {
        if (condition) {
            action
            mywhile(condition)(action)
        }
    }
}
