package com.atguigu.day02.fun

/**
  * Author lzc
  * Date 2019-06-28 08:57
  */
object FunDemo1 {
    def main(args: Array[String]): Unit = {
        /*val sum = add(10, 20)
        println(sum)*/
    
        
    }
    
    def a = {
        println("a")
        10
    }
    
    val b = {
        println("b")
        10
    }
    
    def foo = {
        println("foo...")
    }
    
   /* def foo() = {
        println("foo...")
    }*/
    
    
    /*def add(a: Int, b:Int) {
        a + b
    }*/
    
    /*def add(a: Int, b: Int) = {
        a + b
    }*/
    
    /*def add(a: Int, b: Int): Int = {
        a + b
    }*/
    
    /*def add(a: Int, b:Int) : Int = {
        return a + b
    }*/
    
}

/*

1. return关键字可以省略. 省略之后, 最后一行的值, 会自动返回

2. 返回值也可以省略, 然后scala会根据最后一行的的值的类型推断出来最终的返回值类型

3. 如果返回值类型省略了, 则不能再使用 return

4. = 也可以省略, 这个时候这个函数的返回值永远是 Unit , 一般情况不要这么做

5. 如果没有形参, 则调用的时候可以省略圆括号

6. 如果声明的时候, 省略的圆括号, 这个时候调用的时候也不能加圆括号

7. 如果函数体只有一行代码, 则 {} 可以省略
 */