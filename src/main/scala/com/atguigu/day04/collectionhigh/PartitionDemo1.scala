package com.atguigu.day04.collectionhigh

/**
  * Author lzc
  * Date 2019-07-01 16:38
  */
object PartitionDemo1 {
    def main(args: Array[String]): Unit = {
        // 调用函数的时候只传入部分参数, 其他的暂时不传, 会返回一个新的函数, 这样的函数就叫部分应用函数
        val pow2: Double => Double = math.pow(_,2)
    
        println(pow2(3))
        println(pow2(4))
        println(pow2(5))
        
        val abs = math.abs(_:Double)
        println(abs(-10))
    }
}
/*
部分应用函数:
 

 */