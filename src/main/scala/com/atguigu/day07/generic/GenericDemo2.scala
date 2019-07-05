package com.atguigu.day07.generic

object GenericDemo2 {
    def main(args: Array[String]): Unit = {
//                println(max("a", "ab"))
//                println(max("a", "ab"))
//                println(max(1, 10))
//                println(max(User(30), User(20)))
        
        
        
    }
    
    // Comparable
    /*def max[T <: Comparable[T]](a: T, b: T) = {
        if (a.compareTo(b) > 0) a else b
    }*/
    // T类型必须是Ordered的子类型
    def max[T <: Ordered[T]](a: T, b: T) = {
        if (a > b) a else b
    }
    
}

case class User( age:Int) extends Ordered[User]{
    override def compare(that: User): Int = this.age - that.age
}


/*

泛型界定:

上下限界定:


1. 泛型类
    定义类的时候, 指明参数化的类型
    
    这个泛型在整个类的内部都可以使用

2. 泛型函数
    
    定义函数的时候指明的参数化的类型
    
    这个泛型只能在这个函数内使用


 */
