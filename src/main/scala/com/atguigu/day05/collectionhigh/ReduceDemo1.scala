package com.atguigu.day05.collectionhigh

object ReduceDemo1 {
    def main(args: Array[String]): Unit = {
        // reduce  把集合中的元素经过某种算法, 最终减少到一个值!
        
        val list1 = List(30, 50, 70, 60, 10, 20)
        // 计算他们的和
        //        val reuslt: Int = list1.reduce( (last, ele) => last + ele )
        //        val reuslt: Int = list1.reduce(_ + _)
        
        //        println(reuslt)
        
        // 使用reduce计算集合中的最大值
        
//        val max: Int = list1.reduce((max, ele) => if(max > ele) max else ele)
//        println(max)
        
        val min: Int = list1.reduce((min, ele) => min.min(ele))
        println(min)
        
        //
    }
}
/*

最终的结果是否和集合中的元素的类型相同, 如果相同, 可以考虑使用reduce, 否则不能使用reduce


 */
