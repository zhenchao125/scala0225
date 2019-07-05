package com.atguigu.day07.homework

/**
  * Author lzc
  * Date 2019-07-05 08:09
  */
object Homework {
    def main(args: Array[String]): Unit = {
        //        println(swap(Array(1, 2, 3)).mkString(","))
        //        println(swap(Array(1, 2)).mkString(","))
        //        println(swap(Array(1)).mkString(","))
        
        //        println(sum(List(Option(10), None, Option(5))))
        
        
        val list: List[Any] = List(List(3, List(1, List(1, 3))), 2, List(5))
        println(listSum(list))
    }
    
    def sum(list: List[Option[Int]]) = {
        // 1. foldLeft
        /*list.foldLeft(0){
            case (last, Some(ele)) => last + ele
            case (last, None) => last
        }*/
        
        
        // 2. 使用 collect == filter + map
        /*list.collect{
            case Some(ele) => ele
        }.sum*/
        
        
        // 3. 直接使用map
        
        list.map {
            case Some(ele) => ele
            case None => 0
        }.sum
    }
    
    def swap(arr: Array[Int]) = {
        arr match {
            
            //            case Array(a, b, rest@_*) => Array(b, a, rest:_*)
            case Array(a, b, rest@_*) => Array(b, a) ++ rest
            
            case a => a
        }
    }
    
    // 计算List中所有的Int的和
    def listSum(list: List[Any]): Int = {
        /*var sum = 0
        list.foreach {
            case v: Int => sum += v
            case list: List[Any] => sum += listSum(list)
        }
        sum*/
        
        list.foldLeft(0){
            case (sum, a:Int) => sum + a
            case (sum, list:List[Any]) => sum + listSum(list)
        }
    }
}

/*

2. 利用模式匹配，编写一个 swap 函数，交换数组中前两个元素的位置，前提条件是数组长度至少为2
10,20,30,...
20,10,30...

3. 编写一个函数，计算List[Option[Int]] 中所有非None值之和。分别使用 match 和不使用用match来计算

4. 我们可以用列表制作只在叶子节点存放值的树。举例来说，列表((3 8) 2 (5)) 描述的是如下这样一棵树：
    *
   /|\
  * 2 *
 /\   |
3  8  5
List[Any] = List(List(3, 8), 2, List(5))
不过，有些列表元素是数字，而另一些是列表。在Scala中，你必须使用List[Any]。编写一个leafSum函数，计算所有叶子节点中的元素之和.

 */