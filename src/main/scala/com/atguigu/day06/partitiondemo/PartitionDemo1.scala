package com.atguigu.day06.partitiondemo

object PartitionDemo1 {
    def main(args: Array[String]): Unit = {
//        val list1 = List(30, 50, 70, 60, "abc", true)
        
        // 用 {} 括起来的一个或多个 case 语句 就是 偏函数
    
        /*val list2: List[Any] = list1.map({
            case a: Int => a * a
            case _ => 0
        })*/
        
        // collect == filter + map
        /*val list2 = list1.collect({
            case a: Int => a * a
        })
        println(list2)*/
    }
}
