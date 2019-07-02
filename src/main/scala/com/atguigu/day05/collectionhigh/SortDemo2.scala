package com.atguigu.day05.collectionhigh

class User(val age: Int, val name: String) {
    
    override def toString = s"User($age, $name)"
}

object SortDemo2 {
    def main(args: Array[String]): Unit = {
        val users = List(new User(10, "lisi"), new User(20, "zs"), new User(20, "ww"), new User(15, "zl"))
//        println(users.sorted(new UserOrdering()))
//        println(users.sorted(UserOrdering))
        
//        val list1 = List(30, 50, 70, 60, 10, 20)
//        println(list1.sorted(Ordering.Int.reverse))
        
    }
    
    object UserOrdering extends Ordering[User] {
        override def compare(x: User, y: User): Int = {
            var result = x.age - y.age
            if (result == 0) {
                result = -x.name.compareTo(y.name)
            }
            result
        }
    }
    
}
