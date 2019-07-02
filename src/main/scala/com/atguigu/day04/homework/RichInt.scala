package com.atguigu.day04.homework

object RichInt{
    implicit def int2RichInt(n: Int) = new RichInt(n)
}


class RichInt(val n: Int){
    def +%(rate: Int) = {
        n * (1 + rate / 100.0)
    }
}