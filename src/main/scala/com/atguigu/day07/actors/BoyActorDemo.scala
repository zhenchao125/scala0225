package com.atguigu.day07.actors

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * Author lzc
  * Date 2019-07-05 11:38
  */
object BoyActorDemo {
    def main(args: Array[String]): Unit = {
        
        val actorSystem = ActorSystem("BoyActorDemo")
        
        val girlRef = actorSystem.actorOf(Props(classOf[GirlActor]))
        val boyActor = actorSystem.actorOf(Props(classOf[BoyActor], girlRef))
        
        boyActor ! "start"
    }
}


class BoyActor(girlRef: ActorRef) extends Actor {
    override def receive: Receive = {
        case "start" =>
            println("boy 开始启动, 发动攻击")
            girlRef ! "小姐姐你好"
        
        case "你也好" =>
            println("girl说:" + "你也好")
            val msgSend =
                s"""
                   |做我女朋友好不好, 请选择:
                   |1. ok
                   |2.好
                   |3.同意
                 """.stripMargin
            println("boy说: " + msgSend)
            girlRef ! msgSend
        
        
        case msg =>
            println("girl说: " + msg)
            val msgSend = math.random
            println("boy说: " + msgSend)
            Thread.sleep(2000)
            girlRef ! msgSend
            
        
    }
}