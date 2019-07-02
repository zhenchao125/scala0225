package com.atguigu.day05.collectionhigh

object SortDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        println(list1.sorted(new MyOrdering().reverse))
    }
}
// 写比较启动时候, 都是使用升序
class MyOrdering extends Ordering[Int] {
    override def compare(x: Int, y: Int): Int =
        x - y
        /*if (x > y)
            -1
        else if (x == y)
            0
        else 1*/
}

/*
java:
    Collections.sort(list, comparator)

scala:

三个算子:
    sorted
    
    sortBy
    sortWith
    




排序算法:
    选择
    冒泡
    插入
    
    归并
    快排
    希尔排序
    
    
 */
