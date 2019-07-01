package com.atguigu.day04.set

/**
  * Author lzc
  * Date 2019-07-01 14:37
  */
object SetDemo2 {
    def main(args: Array[String]): Unit = {
        val set1 = Set(10, 20, 30, 40, 50, 60)
        val set2 = Set(10, 20, 30, 4, 50, 6)
        println(set1 & set2)  // 交集
        println(set1 &~ set2) // 差集
        println(set1 | set2) // 并集
        println(set1 ++ set2) // 并集
        println(set1.drop(2))  // 所有集合都可以用
        println(set2.take(3)) // 所有集合都可以用
        
        
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