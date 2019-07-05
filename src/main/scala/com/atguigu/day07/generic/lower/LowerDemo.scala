package com.atguigu.day07.generic.lower

class Earth { //Earth 类
    def sound() { //方法
        println("hello !")
    }
}

class Animal extends Earth {
    override def sound() = { //重写了Earth的方法sound()
        println("animal sound")
    }
}

class Bird extends Animal {
    override def sound() = { //将Animal的方法重写
        println("bird sounds")
    }
}

class Moon
object LowerBoundsDemo {
    def main(args: Array[String]): Unit = {
        
//        biophony(Seq(new Earth, new Earth)).map(_.sound())
//
//        biophony(Seq(new Animal, new Animal)).map(_.sound())
        
        // Bird  Animal Earth Object
        biophony(Seq(new Bird, new Bird)).map(_.sound())
        
        biophony(Seq(new Moon))
        
       /* val res = biophony(Seq(new Bird))
        
        val res2 = biophony(Seq(new Object))
        val res3 = biophony(Seq(new Moon))
        println("\nres2=" + res2)
        println("\nres3=" + res2)*/
        
    }
    
    def biophony[T >: Animal](things: Seq[T]) = things
}
