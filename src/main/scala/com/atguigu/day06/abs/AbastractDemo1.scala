package com.atguigu.day06.abs

object AbastractDemo1 {
    def main(args: Array[String]): Unit = {
        def f() = {
            println("f....")
            7
        }
        
        foo(3 + 4)
    }
    
    def foo(a: => Int) = {
        /*println(a)
        println(a)
        println(a)*/
    }
}

/*
scala中方法参数的两种传递方式:

1. 值传递
    先把要传递的值计算出来, 然后再把计算后的值传递过去

2. 名传递
    def foo(a: => Int)


控制抽象:
    mywhile(i < 10){
        i
        i += 1
    }
 */
