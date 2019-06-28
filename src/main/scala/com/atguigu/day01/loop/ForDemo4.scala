package com.atguigu.day01.loop

import scala.util.control.Breaks.{break, breakable}

/**
  * Author lzc
  * Date 2019-06-26 15:41
  */
object ForDemo4 {
    def main(args: Array[String]): Unit = {
        // 前闭后开的区间
        for(i <- 0 until  10){
            println(i)
        }
    }
}

/*
for是遍历

如何使用for输出1 - 10

首先得有一个序列, 从 1-10, 然后遍历这个序列

for 推断:

退出循环:(while, for, do...while)
 */
