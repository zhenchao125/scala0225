package com.atguigu.day06.patternmatch

object TupleMatch {
    def main(args: Array[String]): Unit = {
        val t2:Any = (10, "abc", 111)
        
        t2 match {
            case (a, b) => println(a)
            case (a, _, c) => println(a, c)
        }
    }
}
