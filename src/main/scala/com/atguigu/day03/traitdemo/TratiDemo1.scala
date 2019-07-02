package com.atguigu.day03.traitdemo

object TratiDemo1 {
    def main(args: Array[String]): Unit = {
        val usb = new HuaweiUsb
        usb.insert()
        usb.log
        usb.remove()
        usb.huaweiAsset
    }
}

trait Usb {
    def insert(): Unit
    
    def remove(): Unit
}

trait Logger {
    def log = {
        println("usb 开始打印工作日志...")
    }
}

class Huawei {
    def huaweiAsset = {
        println("属于华为的资产...")
    }
}

class HuaweiUsb extends Huawei with Usb with Logger {  // implements A, B ,C
    override def insert(): Unit = {
        println("Huwweiusb 已经插入")
    }
    
    override def remove(): Unit = {
        
        println("Huwwei usb 已经移除")
    }
}


/*
类
抽象类
接口
---
java: 接口
    jdk1.8之前
        抽象方法和常量的集合
    
    jdk1.8之后
        default 方法
        
scala:
    没有接口
    
    trait  特质
    
    其实就是对标java中的接口
    
    混入特质 (with)
    
    抽象类中能拥有的成员, trait都可以拥有
    
    

 */