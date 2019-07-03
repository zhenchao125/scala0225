package com.atguigu.day06.patternmatch

object CaseClassDemo {
    def main(args: Array[String]): Unit = {
        val user = new User(21, "lisi")
        user match {
            case User(20, name) => println(name)
        }
    }
}

// 样例类:  专门为模式匹配而生
case class User(val age: Int, val name: String)

/*
object User{
    def unapply(user: User): Option[(Int, String)] = Some((user.age, user.name))
}*/
