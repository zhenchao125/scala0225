package com.atguigu.day05.patternmatch

object TypeMatchDemo1 {
    def main(args: Array[String]): Unit = {
        //        val obj:Any = Array(1.1, 2)
        //        val obj: Any = List[Any](1, 2.1, "abc")
//        val obj: Any = Map[Double, Int]()
        val obj: Any = Map[Double, Int]()
        
        
        obj match {
            case a: Int =>
                println(a)
                
            case s: String =>
                println(s)
                
            case arr: Array[Int] =>
                println("Array[Int]...")
                
            case list: List[_] =>
                println("List[_]...")
                
            case map: Map[_, _] =>
                println("Map[_, _]....")
                
            case _ => println("____")
        }
    }
}

/*

匹配了类型:
    case a: Int =>
    
    
匹配内容:


泛型只存在于 编译阶段, 编译完之后, 在class字节码中是不存在泛型

泛型擦除

 */