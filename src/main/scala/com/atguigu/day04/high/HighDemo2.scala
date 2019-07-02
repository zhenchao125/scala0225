package com.atguigu.day04.high

object HighDemo2 {
    def main(args: Array[String]): Unit = {
        def action(i:Int) = {
            println(i, i * i, i * i * i)
        }
        travelArray(Array(10,20,30, 40, 50), action)
        
        
    }
    
    // 传递过来一个数组, 然后去遍历这个数组, ...
    def travelArray(arr: Array[Int], action: Int => Unit) = {
        for (ele <- arr) {
            action(ele)
        }
    }
    
    
    /*def foo1(f: Int => Unit) = {
        f(100)
    }
    
    
    def foo2(a: Int) = {
        println("a: " + a)
    }*/
}
/*
travelArray 是一个函数, 而且这个函数可以接受一个或多个函数作为参数, travelArray这样的函数就叫高阶函数

返回一个函数作为参数也是高级函数


 */