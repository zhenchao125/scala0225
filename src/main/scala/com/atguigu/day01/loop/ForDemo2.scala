package com.atguigu.day01.loop

import scala.collection.immutable

/**
  * Author lzc
  * Date 2019-06-26 15:41
  */
object ForDemo2 {
    def main(args: Array[String]): Unit = {
        /*for(i <- 1 to 10; j = 20; k = 30){
            println(i, j, k)
        }*/
        
        // 1^2 2^2, 10^2   for推导
       /* var arr = for(i <- 1 to 10 ) yield i * i
    
        println(arr)
        
        val arr2: immutable.IndexedSeq[Int] = (1 to 10).map(x => x * x)
        println(arr2)*/
        
        // for嵌套
        
        /*for(i <- 1 to 9){
            for(j <- 1 to i){
                print(s"$j * $i = ${i * j}\t")
            }
            println()
        }*/
        
        for(i <- 1 to 9; j <- 1 to i){
            print(s"$j * $i = ${i * j}\t")
            if(i == j) println()
        }
        
        
    }
}

/*
for是遍历

如何使用for输出1 - 10

首先得有一个序列, 从 1-10, 然后遍历这个序列

for 推断:
 */
