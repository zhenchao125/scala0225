package com.atguigu.day06.caseclass

/**
  * Author lzc
  * Date 2019-07-03 10:54
  */
object CaseClassDemo1 {
    def main(args: Array[String]): Unit = {
        //        val amount: Account = NormalMount(1000, "rmb")
        val amount: Account = Dollar(1000)
        amount match {
            case Dollar(money) => println(s"$$$money")
            case NormalMount(money, unit) => println(s"$unit$money")
        }
    }
}

//trait Account
abstract class Account

case class Dollar(money: Double) extends Account

case class NormalMount(money: Double, unit: String) extends Account

/*
样例类:

    1. 样例类为模式匹配而生
    
    2. 样例类类的作用和javabean也是可以用来封装数据, 以前使用javabean的地方, 在scala中都应该使用 样例类
    
    3. 将来样例也用于进行进程间通信的时候的通讯协议
    
 会自动的包含以前讲的 伴生对象, 伴生类
 
 apply...
 unapply ...
 
 属性默认都是 val 的

 */