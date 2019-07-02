package com.atguigu.day05.collectionhigh

object FoldDemo2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        //        val sum: Int = (0 /: list1) (_ + _)  //    /:
        
        val sum = (list1 :\ 0) (_ + _)   // :\
        println(sum)
        
    }
    
}

/*
fold
foldLeft
foldRight

reduce
foldLeft
 */