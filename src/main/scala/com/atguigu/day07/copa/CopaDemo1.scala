package com.atguigu.day07.copa

object CopaDemo1 {
    def main(args: Array[String]): Unit = {
        val person = new User
        
        // 一个子类型的数组, 不能赋值给父类型数组的引用
        /*var users: Array[User] = Array[User](new User, new User)
        val persons: Array[Person] = users*/
    
        var users: List[User] = List[User](new User, new User)
        val persons: List[Person] = users
    }
}

class Person
class User extends Person

/*

不变  invariance
    子类型泛型类的对象不能赋值父类型泛型类应用
    
    默认
    
协变  covariance
    子类型泛型类的对象可以赋值父类型泛型类应用
    
    +A
    
逆变  contravariance
    父类型泛型类的对象可以赋值子类型泛型类应用
    
    -A
    
 


 */