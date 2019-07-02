package com.atguigu.day03.imp

import java.io.File

import scala.io.Source

object ImpDemo2 {
    def main(args: Array[String]): Unit = {
        implicit def file2RichFile(file: File): RichFile = new RichFile(file)
        
        val file = new File("C:\\Users\\lzc\\Desktop\\class_code\\2019_02_25\\01_scala\\scala0225\\src\\main\\scala\\com\\atguigu\\day03\\imp\\ImpDemo2.scala")
        // 能够隐式的把File类型转换成具有readContent这个方法的类型
        println(file.readContent)
    }
}


class RichFile(file: File){
    def readContent = {
        Source.fromFile(file).mkString
    }
}
/*
io流 读取文件内容
File 负责文件的元数据, 不关注文件的内容
 */