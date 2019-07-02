package com.atguigu.day05.patternmatch

import scala.io.StdIn

/**
  * Author lzc
  * Date 2019-07-02 16:08
  */
object BaseUseDemo {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        val optartion = StdIn.readLine()
        optartion match {
            case "+" =>
                println(a + b)
            
            case "-" =>
                println(a - b)
            case "/" =>
                println(a / b.toDouble)
            case "*" =>
                println(a * b)
            case _ => println("你输入的运算符不对...")
            
        }
        
    }
}

/*
分支: if
x类型:   byte short int char String enum
switch(x){
    case 常量: ....
      break;
    
    
    default:
            ...
        break;
}

模式匹配:

 */