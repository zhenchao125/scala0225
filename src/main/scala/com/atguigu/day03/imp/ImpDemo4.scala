package com.atguigu.day03.imp

import java.time.LocalDate

object ImpDemo4 {
    def main(args: Array[String]): Unit = {
        
        //   2 days ago // 2019-06-27
        //  2 days later // 2019-07-01
        val ago = "ago"
        val later = "later"
        println(2 days ago)
        println(45 days later)
    }
    
    implicit class RichDate(day: Int) {
        def days(when: String) = {
            val now: LocalDate = LocalDate.now()
            if (when == "ago") {
                now.minusDays(day).toString
            } else {
                now.plusDays(day).toString
            }
        }
    }
}


