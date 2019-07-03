package com.atguigu.day06.patternmatch

object ListMatch1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70)
        
        list1 match {
            //            case List(30,50,70) => println("List(30,50,70)")
            
            //            case 30::50::70::Nil => println("30::50::70::Nil")
            //            case List(30, rest@_*) => println(rest)
            
            //            case 30::rest => println(rest)
            case 30 :: _ => println("aaaa")
        }
        
    }
}

/*

List 的匹配

:: 中置表达式
 */
