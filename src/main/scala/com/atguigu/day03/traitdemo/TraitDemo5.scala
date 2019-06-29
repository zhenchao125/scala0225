package com.atguigu.day03.traitdemo

object SelfDemo {
    def main(args: Array[String]): Unit = {
        val console = new Console
        console.log()
    }
}


trait Logger1 {
    // 将来混入Logger1的类必须使用Exception或者他的子类作为直接父类
    this: Exception =>
    def log(): Unit = {
        println(getMessage())
    }
}

class Console extends RuntimeException with Logger1 {

}

