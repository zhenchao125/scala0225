package com.atguigu.day06

object EitherDemo {
    def main(args: Array[String]): Unit = {
        // Either 类似 Option
        // Either 表示正确或错误
        
        /*sqrt(-9) match {
            case Left(msg) => println(msg)
            case Right(result) => println(result)
        }*/
        
        val either: Either[String, Double] = sqrt(9)
        if(either.isRight){
            println(either.right.get)
        }
        1 toString
    }
    
    def sqrt(d: Double): Either[String, Double] = {
        if (d < 0) {
            Left("负数没有平方根")
        } else {
            Right(math.sqrt(d))
        }
    }
}
