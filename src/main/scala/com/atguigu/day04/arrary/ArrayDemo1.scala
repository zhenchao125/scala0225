package com.atguigu.day04.arrary

/**
  * Author lzc
  * Date 2019-07-01 09:29
  */
object ArrayDemo1 {
    def main(args: Array[String]): Unit = {
        // 底层就是使用的java的数组(定长)
        val arr = Array(1,2,3,4,5)
        arr(0) = 100
        
        println(arr(0))
        // 遍历 1
        for(i <- 0 until arr.length){
            println(arr(i))
        }
        
        // 遍历 2
        for(ele  <- arr){
            println(ele)
        }
    }
}
/*

定长数组:
    其实就是java中的数组


xml:
    <name>  <>
    
1. scala原生的支持xml, 所以它把  <> 给了xml的标签

2. 泛型用  []

3. 访问下标的元素 用()

 */