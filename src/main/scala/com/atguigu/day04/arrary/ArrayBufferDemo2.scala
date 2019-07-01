package com.atguigu.day04.arrary

import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019-07-01 09:29
  */
object ArrayBufferDemo2 {
    def main(args: Array[String]): Unit = {
        
        //        val arr3: ArrayBuffer[Int] = arr1 ++ arr2
        //        arr1 ++= arr2
        
        //        val arr3 = 100 +: arr1   // arr1.+:(100)
        
        //        arr1 :+ 100
        
        //        100 +=: arr1
        
        //        val arr3: ArrayBuffer[Int] = arr1 ++: arr2  //
        //        val arr4: ArrayBuffer[Int] = arr1 ++ arr2  //
        //        println(arr3)
        //        println(arr4)
        
        //        arr1 ++=: arr2
        val arr1 = ArrayBuffer(10, 20, 10, 30, 40)
        val arr2 = ArrayBuffer(100, 200, 300, 400, 10)
        
        // remove  删除第一个
//        println(arr1 - 10)
//        arr1 -= 10
        
        println(arr1)
        println(arr2)
        
        
    }
}

/*
:+  在尾部添加元素
+:  在头部添加一个元素
+=
+=:
++
++=

-
-=


Set 集合一般使用差集, 并集, 交集


运算符的结合性:
    左集合
        1 + 1   // 1.+(1)
        
        大部分都是做结合
        ++
        /
        *
        
    
    
    右集合
        =
        
        如果一个运算符是使用 : 结尾都是右结合

 */