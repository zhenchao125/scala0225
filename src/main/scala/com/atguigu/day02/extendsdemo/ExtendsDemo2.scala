package com.atguigu.day02.extendsdemo

object ExtendsDemo2 {
    def main(args: Array[String]): Unit = {
       /* var a: A = new B
        
        a.say()*/
        
        
    }
}

class A{
    def say() ={
        println("A...say")
    }
}

class B extends A{
     override def say(): Unit = {
        println("B...say")
    }
}
