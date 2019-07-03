package com.atguigu.day06.patternmatch

object ObjMatchDemo1 {
    def main(args: Array[String]): Unit = {
        val d = -9.0
        
        d match {
            // My.unapply(d)   返回 Some 或者 None
            // 如果返回的是Some表示匹配成功, 把Some中的值赋值Wie n
            case My(n) => println(n)
            case  _ => println("没有匹配成功")
        }
    }
}

object My {
    // 对象提取器
//    def unapply(d: Double): Option[Double] = if (d >= 0) Some(math.sqrt(d)) else None
    
    def unapply(d: Double): My = new My(d)
}
class My(d: Double){
    def isEmpty = if(d < 0) true else false
    def get = math.sqrt(d)
}

/*
对象提取器

关于对象提取器的原理,
    // My.unapply(d)   返回 Some 或者 None
            // 如果返回的是Some表示匹配成功, 把Some中的值赋值Wie n
            
从2.11.1这个版本开始提取的要求做了放松:
    要求unapply的返回值不必须是Option, 可以是其他类型:
        必须要有两个方法:
          1. def isEmpty: Boolean
                是否为空, 如果是true表示匹配失败, 如果是 false表示匹配成功
                
           2. 如果 isEmpty 是false, 然后会从
            def get : T 来获取匹配到的值
     
 */