package com.atguigu.day03.traitdemo

object TDemo3 {
    def main(args: Array[String]): Unit = {
        new Son1
    }
}
class ABC

class TrFather {
    println("特质会继承这个类...")
}
// 1. 将来混入 Ttr 的那些类, 必须使用TrFather作为直接父类或者使用TrFather的子类作为直接父类
trait Ttr extends TrFather {
    println("特质...")
}

class Son1 extends Ttr {
    println("子类...")
}

