package com.atguigu.day05.collectionhigh

object SortWithDemo2 {
    def main(args: Array[String]): Unit = {
        
        val users = List(new UserA(10, "lisi"), new UserA(20, "zs"), new UserA(20, "ww"), new UserA(15, "zl"))
        val list2 = users.sortWith(_ < _)
        println(list2)
    }
}

class UserA(val age: Int, val name: String) extends Ordered[UserA] {
    override def compare(that: UserA): Int = {
        this.age - that.age
    }
    
    override def toString = s"UserA($age, $name)"
}




/*class UserA(val age: Int, val name: String) extends Comparable[UserA] {
    override def compareTo(o: UserA): Int = {
        this.age - o.age
    }
    
    def <(o:UserA) = {
        if (this.compareTo(o) < 0) true
        else false
    }
    def >(o:UserA) = {
        if (this.compareTo(o) > 0) true
        else false
    }
    
    
    override def toString = s"UserA($age, $name)"
}*/

