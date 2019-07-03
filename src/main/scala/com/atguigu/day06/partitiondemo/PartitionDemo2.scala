package com.atguigu.day06.partitiondemo

object PartitionDemo2 {
    def main(args: Array[String]): Unit = {
        val map = Map("a" -> ("aa", 1), "b" -> ("bb", 2), "c" -> ("cc", 1)).toList
        
        /*val result: Map[String, Int] = map.map(kv => (kv._1, kv._2 * 10))
        println(result)*/
        
       /* val result: Map[String, Int] = map.map {
            case (k, v) => (k, v * 10)
        }*/
        
//        val result = map.map(kv => (kv._1, (kv._2._1, kv._2._2 *10)))
        val result = map.map{
            case (word, (k, v)) => (word, (k, v *10))
        }
        println(result)
        
    }
}
