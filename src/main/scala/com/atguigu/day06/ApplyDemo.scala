package com.atguigu.day06

/**
  * Author lzc
  * Date 2019-07-03 16:48
  */
object ApplyDemo {
    def main(args: Array[String]): Unit = {
        /*val arr1 = Array(30, 50, 70, 60, 10, 20)
        arr1(0) = 100*/
        
        val user = new User(100)
        
        user("age") = 12.5
//        user.age = 20
        println(user.age)
    }
}

class User(var age: Int) {
    def update(propName: String, value:Int) = {
        propName match {
            case "age" => this.age = value
            
        }
    }
    
    def update(propName: String, value:Double) = {
        propName match {
            case "age" => this.age = value.toInt
            
        }
    }
}

/*
1. 伴生对象中的apply
    User(...)

2. 伴生类中的apply
    u1(...)
    集合: arr(0) list(0)  map(key)
    
 3. update
 */