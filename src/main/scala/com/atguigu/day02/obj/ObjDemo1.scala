package com.atguigu.day02.obj

import scala.beans.BeanProperty

/**
  * Author lzc
  * Date 2019-06-28 11:01
  */
object ObjDemo1 {
    def main(args: Array[String]): Unit = {
        val user = new User("lisi", 10, "male")
        println(user.name)
        println(user.age)
        user.age = 100 // user.age_$eq(200)
        println(user.age)
        user.getName()
        new User("", 10, "")
    }
}


class User(@BeanProperty val name: String, @BeanProperty var age: Int,  sex: String){
   println("test...")
    
    @BeanProperty val country : String = "中国"
    var abc : String = "中国"
    
    def foo = println(this.sex)
}

/*

主构造(必须一定有)
    1. 主构造的形参会自动的成为对象的属性
    2. 主构造内的代码在创建对象的时候, 一定会执行
    
辅助构造:



会自动提供getter和setter方法, 但是默认的setter和getter不满足标准的javabean规范
    getName, setName("")


java 类:
    一个文件一个类, 一般是public, 然后类名和文件名一致

scala:
    一个文件中类的个数没有限制, 也不需要public

面向对象分析
    先有对象, 后有类

面向对象设计
    先有类, 再有对象
 */
