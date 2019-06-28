package com.atguigu.day02.extendsdemo

/**
  * Author lzc
  * Date 2019-06-28 15:45
  */
object ExtendsDemo3 {
    def main(args: Array[String]): Unit = {
        val aa: AA = new BB
        val bb: BB = aa.asInstanceOf[BB]   //
        println(aa.a)
        println(bb.a)
        
    }
}


class AA {
    val a: Int = 10
    var b: Int = 20
    
    def c = 30
}

class BB extends AA {
    override val a: Int = 100
    //    override var b: Int = 200
    
    override val c = 300
}

/*
属性的覆写:

1. 只能使用val去覆写父类的val和 没有参数的def

2. var只能去覆写抽象的var  (抽象字段)

方法的覆写:
    和java完全一样
    
    限制:  2同2小1大
        方法名和参数列表 必须相同
        返回值类型和抛出异常要小或者同
        修饰符不能小于父类
 */