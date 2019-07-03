package com.atguigu.day06.recursive

import scala.annotation.tailrec

/**
  * Author lzc
  * Date 2019-07-03 15:25
  */
object RecursiveDemo {
    def main(args: Array[String]): Unit = {
        println(sum(1, 1000000, 0))
//        println(sum1(1, 1000000))
    }
    @tailrec
    def sum(from: BigInt, to: BigInt, acc: BigInt): BigInt = {
        if (from == to) throw new RuntimeException
        else sum(from + 1, to, from + acc)
    }
    
    // 1 100
    def sum1(from: BigInt, to: BigInt): BigInt = {
        if (from == to) to
        else from + sum1(from + 1, to)
    }
}

/*
尾递归:
    递归调用时最后一样, 并且除了了递归调用,没有其他运算
    
    1 + 2 + 3 + ... + 100
    
    acc "累加器"


尾递归优化:
    重用的方法的调用栈
    
    编译器会优化成循环(迭代算法)
    
    java没有做尾递归优化, 在java中即使使用的尾递归, 和没有使用没啥区别

 */
