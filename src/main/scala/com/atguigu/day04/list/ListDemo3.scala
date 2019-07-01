package com.atguigu.day04.list

/**
  * Author lzc
  * Date 2019-07-01 11:31
  */
object ListDemo3 {
    def main(args: Array[String]): Unit = {
        /*var list1 = List(30, 50, 70, 60, 10, 20)
        var list2 = list1
        list2 :+= 100
    
        println(list1)
        println(list2)*/
    
        var list1 = List(30, 50, 70, 60, 10, 20)
        println(System.identityHashCode(list1))  // 打印最原始地址值
        list1 :+= 100
        println(System.identityHashCode(list1))
        println(list1.hashCode())
    }
}

/*
不可变的List
    
    
    :: 是不可变 List 专有的
    
    ::: 两个list相加
    
可变:


:+=  这种带 = 的运算符, 如果是操作的不可变集合, 则是创建一个新的集合, 然后重新对变量进行赋值

如果是操作的可变集合, 则直接在原集合上进行操作

 */
