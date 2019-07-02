package com.atguigu.day03.traitdemo

object ApplyDemo {
    def main(args: Array[String]): Unit = {
        // 1. 访问伴生对象中的 apply
//        Human("李四")
        
        // 2. 伴生类中的apply方法
        val human = new Human()
//        human("abc")  //  ==== human.apply("abc")
        println(human.name)
        println(human("name"))
        println(human("age"))
        
    }
}


/*object Human{
    def apply(name:String) = println(" 伴生对象中的 apply")
}*/

class Human{
    val name = "李四"
    val age = 20
    
    def apply(prop: String) ={
        println(" 伴生类中的apply")
        if(prop == "age") this.age
        else if(prop == "name") this.name
    }
}