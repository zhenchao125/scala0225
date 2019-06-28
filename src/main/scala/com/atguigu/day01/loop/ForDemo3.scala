package com.atguigu.day01.loop


import scala.util.control.Breaks.{break, breakable}

/**
  * Author lzc
  * Date 2019-06-26 15:41
  */
object ForDemo3 {
    def main(args: Array[String]): Unit = {
        /*for(i <- 1 to 10 if i < 5){
            println(i)
        }*/
        
        // 完美正统的退出循环
        breakable {
            for (i <- 1 to 10) {
                if (i == 5) break
                println(i)
            }
        }
        println(10000)
        
        // 用函数结束循环
        
    }
}

/*
for是遍历

如何使用for输出1 - 10

首先得有一个序列, 从 1-10, 然后遍历这个序列

for 推断:

退出循环:(while, for, do...while)
 */
