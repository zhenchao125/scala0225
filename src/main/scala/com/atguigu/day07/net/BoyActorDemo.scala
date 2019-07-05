package com.atguigu.day07.net

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.{Config, ConfigFactory}

/**
  * Author lzc
  * Date 2019-07-05 11:38
  */
object BoyActorDemo {
    def main(args: Array[String]): Unit = {
        // 创建Config对象, 并监听指定的ip地址和端口  本地信息
        val config: Config = ConfigFactory.parseString(
            s"""
               |akka.actor.provider="akka.remote.RemoteActorRefProvider"
               |akka.remote.netty.tcp.hostname=192.168.2.228
               |akka.remote.netty.tcp.port=10000
            """.stripMargin)
        val actorSystem: ActorSystem = ActorSystem("Boy", config)
        val boyActor: ActorRef = actorSystem.actorOf(Props(classOf[BoyActor], "192.168.2.228", 20000), "BoyActor")
        boyActor ! "start"
        
    }
    
}


class BoyActor(remoteHost: String, removePort: Int) extends Actor {
    var girlRef: ActorSelection = _
    
    // 当 这个Actor启动的时候, 会先调用这个方法
    override def preStart(): Unit = {
        // 远程actor的路径
        val path = s"akka.tcp://GirlSystem@$remoteHost:$removePort/user/GirlActor"
        // 拿到远程actor的引用, 通过这个引用就可以给对方发送信息
        girlRef = context.actorSelection(path)
    }
    
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