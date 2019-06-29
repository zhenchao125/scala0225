package com.atguigu.day03.homework

object Homework1 {
    def main(args: Array[String]): Unit = {
        val card = new Card("♦")
        println(card)
        println(card.isRed)
        
        
        println(new User(10).equals(new User(10)))
        println(new User(10) == new User(10))  // java:equals
        println(new User(10) eq new User(10))  // java: ==
    }
}

class User(val age: Int) {
    override def hashCode(): Int = age
    
    override def equals(obj: scala.Any): Boolean = {
        if (obj == null || !obj.isInstanceOf[User]) {
            return false
        }
        
        val o = obj.asInstanceOf[User]
        this.age == o.age
    }
}

class Card(val color: String) {
    override def toString: String = this.color
    
    def isRed = color == "♦" || color == "♥"
}

/*

2. 编写一个扑克牌只能有 4 种花色,让其 toString 方法分别返回♣,♦,♥,♠，并实现一个函数,检查某张牌的花色是否为红色

在java:
    ==                          equals(hashCode)
    地址值是否相等                判断内容: 自己定义相等的规则
    
    
    
 scala:
    
    ==          equals             eq
    
     == 和equals完全等价            等价于java中的 ==
    


*/