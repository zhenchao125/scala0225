package com.atguigu.day04.arrary

import java.util
// java转scala和scala转java的全部拿过来
import scala.collection.JavaConversions._

object ArrayDemo3 {
    def main(args: Array[String]): Unit = {
        
        val list = new util.ArrayList[Int]()
        list.add(10)
        list.add(100)
        list.add(1000)
        
        for(ele <- list){
            println(ele)
        }
    
        println(list.head)
        println(list.tail)
        
    }
}
