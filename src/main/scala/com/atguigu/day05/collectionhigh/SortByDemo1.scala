package com.atguigu.day05.collectionhigh

object SortByDemo1 {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 5, 70, 60, 1, 2)
        //        val list2: List[Int] = list1.sortBy(x => x)(Ordering.Int.reverse)
        //        val list2: List[Int] = list1.sortBy(x => x % 2)(Ordering.Int.reverse)
        //        println(list2)
        
//        val list1 = List("hello", "world", "ha", "hive", "atguigu")
        
        //        println(list1.sortBy(x => x.length)(Ordering.Int.reverse))
        
//        val list2: List[String] = list1.sortBy(x => (x.length, x))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String.reverse))
    
        val users = List(new User(10, "lisi"), new User(20, "zs"), new User(20, "ww"), new User(15, "zl"))
        val list2: List[User] = users.sortBy(user => (user.age, user.name))
        println(list2)
    }
}
