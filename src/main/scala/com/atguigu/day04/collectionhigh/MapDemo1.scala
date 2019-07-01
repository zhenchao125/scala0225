package com.atguigu.day04.collectionhigh

/**
  * Author lzc
  * Date 2019-07-01 16:49
  */
object MapDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        // map使用特别的广阔  调整数据结构的类型
        val result = list1.map(x => "a")
        println(result)
    }
}
/*
foreach

map

都会把函数应用在每个元素省,  map会有返回值, foreach没有返回值


 */