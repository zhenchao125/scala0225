package com.atguigu.day04.arrary

object MultiDimDemo {
    def main(args: Array[String]): Unit = {
        val arr: Array[Array[Int]] = Array.ofDim[Int](2, 3)
        
        arr(0)(0) = 100
        arr(1)(2) = 1000
        for (arr1 <- arr) {
            for (elem <- arr1) {
                println(elem)
            }
        }
    }
}
/*
一维数组:

二维数组:
    java的多维数组都是假的

 */
