package com.atguigu.day01.loop

object WhileDemo1 {
    def main(args: Array[String]): Unit = {
        var i = 1
        while (i < 101) {
            println(i)
            i += 1
        }
        
        /*do{
            println(i)
            i += 1
        }while(i < 200)*/
    }
}
