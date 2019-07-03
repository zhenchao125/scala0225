package com.atguigu.day06.patternmatch

object ObjMatchDemo2 {
    def main(args: Array[String]): Unit = {
        val names = "zs,ww"
        
        names match {
            case Names(a, b, c, d) => println(a, c)
        }
        
        
        val list1 = List(30, 50, 70, 60, 10, 20)
        list1 match {
            case List(10) =>
        }
    }
}

object Names {
    def unapplySeq(s: String) =
        if (!s.contains(",")) None
        else Some(s.split(","))
}

/*

unapply 提取单个对象

unapplySeq

 */