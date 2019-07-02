package com.atguigu.day03.traitdemo

object TDemo {
    def main(args: Array[String]): Unit = {
//        val son = new Son
//        println(son.a1)
        /*
        动态混入 在创建对象的时候, 只对这个对象来混入特定的特质
         */
        val p1 = new Person with tr
        
        p1.foo
    }
}
class Person


trait tr{
    val a1 = "最上面的特质的 a1"
    println("最上面特质的构造器")
    
    def foo = {
        println("foo...")
    }
}

trait tr1 extends tr{
    override val a1 = "第一个特质的 a1"
    println("第一个特质的构造器")
}

trait tr2 extends tr{
    override val a1 = "第二个特质的 a1"
    println("第二个特质的构造器")
}

class Father{
    val a1 = "父类的 a1"
    println("父类的构造器")
}
class Son extends Father with tr1 with tr2{
    override val a1 = "子类的 a1"
    println("子类的构造器")
}
