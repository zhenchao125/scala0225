package com.atguigu.day01.stringdemo

object StringDemo2 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = "hello"
        val c = 20.3
        
        // {"a": 10, "c": "hello", ...}
        val s = s"{a: ${a * 2}, b: $b, c: $c}"
        println(s)
        
        // 原始字符串
        
        val ss =
            s"""
              |select
              |	id,
              |	name
              |from user
              |where id=$a
            """.stripMargin
        println(ss)
    }
}

/*


 */