package com.atguigu.day04.set

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-07-01 14:37
  */
object SetDemo1 {
    def main(args: Array[String]): Unit = {
        val set1 = Set(10, 20, 30, 40, 50, 60)
        println(set1)
//
//        val set2 = mutable.Set(10, 20, 30, 40, 10, 30)
//        println(set2)
        
        val arr1 = Array(30, 50, 70, 60, 10, 20, 30, 20, 10)
//        val set = Set(arr1:_*)
//        println(set)
        println(arr1.toSet.toBuffer)
        println(arr1.toSet.toList)
        
    }
}
/*
java set:  无序不可重复


Set 可变和不可变
    长度小于等于4不可变set: 有序, 不可重复
    可变Set: 无序不可重复

set用途:  去重

并集
差集
交集
 */