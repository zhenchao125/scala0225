package com.atguigu.day02.importdemo

//import java.util.{ArrayList, List => JL}
//import java.util.{List => JL, _}

import java.util
import java.util.{List => JL, ArrayList => _, _}

object ImportDemo1 {
    def main(args: Array[String]): Unit = {
        val list: JL[Int] = new util.ArrayList[Int]()
        
        classOf[List[_]]
        
    }
}

/*
包的导入与java的不同点:

1. 推荐仍然采用顶部导入的方式

2. 可以在代码的任意的地方导入

3. 给类起别名
    import java.util.{List=> JL}
    
4. 同时导入多个


----

默认导入的包:
1. java.lang._

2. scala._

3. 自动导入一个对象:
    Predef._ 所有的成员
 */