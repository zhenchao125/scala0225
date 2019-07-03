package com.atguigu.day06.recursive

object ApplyDemo2 {
    def main(args: Array[String]): Unit = {
        val f = foo _
        
        f()
        f.apply
        
    }
    
    def foo() = {
        println("foo...")
    }
    
    def foo_: = {}
    
    def a_+ = {}
}
