package com.atguigu.day01.loop

/**
  * Author lzc
  * Date 2019-06-26 15:41
  */
object ForDemo1 {
    def main(args: Array[String]): Unit = {
        /*val a = "hello"
        
        for(c <- a){  // c:a
            println(c)
        }*/
        /*for (i <- 0 to (10, 2)) {  // 0.to(10,2)
            println(i)
        }*/
        
        /*for(i <- 1 to 100 reverse){  // 1.to(100).reverse
            println(i)
        }*/
        
        /*for(i <- 1 to (100, 2) reverse){  // 1.to(100).reverse
            println(i)
        }*/
        
        
        // if 守卫  (while不能用)
        for (i <- (1 to 100).reverse if i % 2 == 0) {
            println(i)
        }
        
        
    }
}

/*
for是遍历

如何使用for输出1 - 10

首先得有一个序列, 从 1-10, 然后遍历这个序列

 */
