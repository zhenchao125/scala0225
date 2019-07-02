package com.atguigu.day05.collectionhigh

object SortWithDemo1 {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        // 测试 x是否小于y
        /*val list2: List[Int] = list1.sortWith((x, y) => {
            if (x < y) true else false
        })*/
        //        val list2: List[Int] = list1.sortWith((x, y) => x < y)
        //        val list2: List[Int] = list1.sortWith(_ < _)
        
        
        val users = List(new User(10, "lisi"), new User(20, "zs"), new User(20, "ww"), new User(15, "zl"))
        val list2 = users.sortWith((user1, user2) => {
            if (user1.age == user2.age) {
                user1.name > user2.name
            } else {
                user1.age < user2.age
            }
        })
        println(list2)
    }
}
