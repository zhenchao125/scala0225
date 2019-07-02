package com.atguigu.day05.patternmatch

/**
  * Author lzc
  * Date 2019-07-02 16:29
  */
object MatchVarVal {
    val Aaaaa = 9
    
    def main(args: Array[String]): Unit = {
        //        val a = 10
        val n: Any = 9
        n match {
            // 识别常量变量: 看首字母是否大写
            case Aaaaa =>
                println(Aaaaa)
            case a: Double =>
                println(a)
            
            case a => println("a:" + a)
            
        }
    }
}
