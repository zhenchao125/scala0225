package com.atguigu.day03.imp

object A {
    
    implicit def a2B(a: A) = new B
}

class A {

}

object B {
}

class B {
    def foo = {
        println("B  foo")
    }
}

object ImpDemo6 {
    
    def main(args: Array[String]): Unit = {
    
    
//        val b: B = new A
//        b.foo
        val s: String = "abc"
        
        // String -> StringLike
        val s3: String = s * 3  // StringOps
        println(s3)
    
    }
}

