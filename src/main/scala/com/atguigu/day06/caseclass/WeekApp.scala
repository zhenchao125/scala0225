package com.atguigu.day06.caseclass

/**
  * Author lzc
  * Date 2019-07-03 14:15
  */
object WeekApp {
    def main(args: Array[String]): Unit = {
        WeekDay.Mon
        
    }
}


object WeekDay extends Enumeration {
    type WeekDay = Value  // 固定写法
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
}
