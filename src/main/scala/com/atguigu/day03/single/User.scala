package com.atguigu.day03.single


object UserDemo{
    def main(args: Array[String]): Unit = {
        val user = User(10)
        println(user.age)
        
    }
}

object User {
    def apply(age: Int) = {
        println("apply  ")
        new User(age)
    }
}


class User(val age:Int)

/*
1. 当直接使用  伴生对象(参数) 会自动的去调用伴生对象的apply方法
2. apply 一般用来实现什么:  一般是返回伴生类的对象
 */