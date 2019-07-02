package com.atguigu.day03.traitdemo

object TraitDemo2 {
    def main(args: Array[String]): Unit = {
        val c = new C
        c.foo
    }
}

trait AB {
    def foo = println("AB foo")
}

trait A extends AB {
    
    override def foo = {
        super.foo
        println("A foo")
    }
}

trait B extends AB {
    
    override def foo = {
        super[AB].foo
        println("B foo")
    }
}

class C extends AB with A with B


