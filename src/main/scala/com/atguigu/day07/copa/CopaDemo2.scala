package com.atguigu.day07.copa

/**
  * Author lzc
  * Date 2019-07-05 10:37
  */
object CopaDemo2 {
    def main(args: Array[String]): Unit = {
//        val tu = new Test[User]
//        val tp:Test[Person] = tu
        
        val tp = new Test2[User]
        val tu: Test2[User] = tp
    }
}


class Test[+A]

// 逆变
class Test2[-A]