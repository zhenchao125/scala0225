package com.atguigu.day02.access

object AccessDemo1 {
    def main(args: Array[String]): Unit = {
        val user = new User
        user.foo()
    }
}
/*object AccessDemo2{
    def main(args: Array[String]): Unit = {
        val user = new User
        user.foo()
        user.foo1
    }
}*/



class User{
    private[access] def foo() ={
        println("foo..")
    }
    
   
}