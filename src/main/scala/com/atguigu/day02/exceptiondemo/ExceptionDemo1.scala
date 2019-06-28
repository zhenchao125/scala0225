package com.atguigu.day02.exceptiondemo

import java.io.{FileInputStream, FileNotFoundException}

/**
  * Author lzc
  * Date 2019-06-28 10:14
  */
object ExceptionDemo1 {
    def main(args: Array[String]): Unit = {
        
        
        val value = try {
            new FileInputStream("")
        } catch {
            case a: FileNotFoundException => throw new RuntimeException
            case a: Exception => throw new RuntimeException
        } finally {
            println("aaa")
        }
        println(value)
    }
    
    val a: Double = 10
}

class User{
    var age:Int = _
    
}

/*
异常的处理:
    1. 抛出异常
        a: 抛异常对象
        b: 抛异常类型
    
    2. 捕捉异常
        try catch  finally

 */
