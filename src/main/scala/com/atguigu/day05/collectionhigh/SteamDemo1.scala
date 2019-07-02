package com.atguigu.day05.collectionhigh

object SteamDemo1 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70, 60, 10, 20)
        val stream: Stream[Int] = list1.toStream*/
        /*println(stream.head)
        println(stream.tail)
        stream.foreach(x => println(x))*/
        /*println(stream)
        val s1: Stream[Int] = stream.force // 所有的元素强制求值
        println(s1)*/
        
        val s: Stream[BigInt] = numFrom(10)
        
        /*println(s.tail)
        println(s.tail.head)
        println(s.tail.head)
        println(s.tail.head)
        println(s.tail.head)*/
//        println(s.force)
    }
    
    def numFrom(from: BigInt): Stream[BigInt] ={
        println("form: " + from)
        from #:: numFrom(from + 1)
    }
}
