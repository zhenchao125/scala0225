package com.atguigu.day06.abs

/**
  * Author lzc
  * Date 2019-07-03 15:05
  */
object AbstractDemo2 {
    def main(args: Array[String]): Unit = {
        runInThread {
            println("在子线程中执行:" + Thread.currentThread().getName)
            println("在子线程中执行:" + Thread.currentThread().getName)
            println("在子线程中执行:" + Thread.currentThread().getName)
            println("在子线程中执行:" + Thread.currentThread().getName)
            println("在子线程中执行:" + Thread.currentThread().getName)
        }
    }
    
    def runInThread(action: => Unit) = {
        new Thread() {
            override def run(): Unit = action
        }.start()
    }
}

/*

写一个函数, 可以在一个子线程中执行传递过来的代码
 */