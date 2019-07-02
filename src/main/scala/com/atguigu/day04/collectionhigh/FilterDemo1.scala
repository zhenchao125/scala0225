package com.atguigu.day04.collectionhigh

object FilterDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, "abc", 70, 60, 10, 20, true)
        /* val list2: List[AnyVal] = list1.map(x => {
             if (x.isInstanceOf[Int]) {
                 val intX = x.asInstanceOf[Int]
                 intX * intX
             }
             
         })*/
        /*val list2 = list1
            .filter(x => x.isInstanceOf[Int])  // 过滤出来int类型
            .map(x => x.asInstanceOf[Int])  // 转成Int类型
            .map(x => x * x) // 平方*/
        val list2 = list1
            .filter(_.isInstanceOf[Int])
            .map(_.asInstanceOf[Int])
            //            .map(x => x * x)
            .map(_ + 100)
        println(list2)
    }
}

/*

map: 长度一定不变
filter: 小于等于
 */