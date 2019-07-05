package com.atguigu.day07.actor

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * Author lzc
  * Date 2019-07-05 10:54
  */
object ActorHello {
    
    
    
    def main(args: Array[String]): Unit = {
        // 启动actor
        // 1. 先有actor系统
        val actorSystem = ActorSystem("ActorHello")
        // 2. 通过actor系统去创建actor对象
        val props: Props = Props(classOf[HelloActor])   // classOf[HelloActor] === HelloActor.class
        val helloRef: ActorRef = actorSystem.actorOf(props)
        // 3. 给整个actor对象发送信息
        helloRef ! "start"
        helloRef ! "ok"
        helloRef ! "ok"
        helloRef ! "ok"
        helloRef ! "oasfasdfasdfk"
        
    }
}

class HelloActor extends Actor {
    override def receive: Receive = {
        case "start" =>
            println("actor开始启动")
        case "ok" =>
            println("ok")
        
        case _ => println("你发的是啥")
    }
}

