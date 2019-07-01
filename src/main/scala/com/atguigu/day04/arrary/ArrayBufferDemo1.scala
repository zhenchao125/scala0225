package com.atguigu.day04.arrary

import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019-07-01 09:29
  */
object ArrayBufferDemo1 {
    def main(args: Array[String]): Unit = {
        val arr = ArrayBuffer(10, 20, 30, 40)
        // 创建空的 ArrayBuffer
//        val arr1 = ArrayBuffer[Int]()
       /* arr(0)
        for (elem <- arr) {
            println(elem)
        }*/
        
        // 增 删 改
        /*arr.append(100, 200)
        arr.prepend(1000, 2000)
        arr.insert(1, 0, 0)
        
        arr.appendAll(Array(1,2,3,4))*/
        arr += 1
        
        
        println(arr)
        
        
    }
}

/*



 */