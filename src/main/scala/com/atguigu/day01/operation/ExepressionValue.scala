package com.atguigu.day01.operation

/**
  * Author lzc
  * Date 2019-06-26 15:09
  */
object ExepressionValue {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        
        
        val max = if (a > b) a else b
        
        println(max)
        
        
        var aa = 100
        val bb = (aa = 200)
        println(bb)
        
        println(aa = 300)
    }
}

/*
在scala中,任何的语法结构都有值

具体的值是由最后一样代码的值类确定

赋值语句的值是: Unit

 */
