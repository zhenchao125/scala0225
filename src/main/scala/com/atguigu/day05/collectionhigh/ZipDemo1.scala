package com.atguigu.day05.collectionhigh

object ZipDemo1 {
    def main(args: Array[String]): Unit = {
        // 是把两个集合, 合并成一个
        val list1 = List(30, 50, 70, 60)
        val list2 = List(3, 5, 7, 6, 1, 2)
    
        println(list1.zipWithIndex)
        
        //        println(list1.zipAll(list2, -1, -2))
        
        /* val list3: List[(Int, Int)] = list1.zip(list2)
         println(list3)
     
         println(list3.unzip)*/
    }
}

/*
scala中的拉链, 如果两边的集合的长度不一样, 会忽略多余

但是在spark中, 也有拉链, spark的拉链如果出现长度不一样, 会抛异常

 */