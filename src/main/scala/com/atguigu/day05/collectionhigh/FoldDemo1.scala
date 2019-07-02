package com.atguigu.day05.collectionhigh

object FoldDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        //        val result: Int = list1.foldLeft(0)((z, ele) => z + ele)
        //        val result: Int = list1.foldLeft(0)(_ + _)
        //        val result: Int = list1.foldLeft(1)(_ * _)
        //        println(result)
        
        // 计算最大值
        //        val max: Int = list1.foldLeft(Int.MinValue)((a, b) => a.max(b))
        //        println(max)
        
        // 一次性计算最大值和最小值
        
        //        val maxMin: (Int, Int) = list1.foldLeft((Int.MinValue, Int.MaxValue))((maxMin, ele) => ( maxMin._1.max(ele), maxMin._2.min(ele)))
        val maxMin: (Int, Int) =
            list1.foldLeft((list1.head, list1.head))((maxMin, ele) => (maxMin._1.max(ele), maxMin._2.min(ele)))
        println(maxMin)
        
    }
    /*
    fold
    foldLeft
    foldRight
    
    reduce
    foldLeft
     */
}
