package com.atguigu.day07.net

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.{Config, ConfigFactory}

object GirlActorDemo {
    def main(args: Array[String]): Unit = {
        val config: Config = ConfigFactory.parseString(
            s"""
               |akka.actor.provider="akka.remote.RemoteActorRefProvider"
               |akka.remote.netty.tcp.hostname=192.168.2.228
               |akka.remote.netty.tcp.port=20000
            """.stripMargin)
        val actorSystem: ActorSystem = ActorSystem("GirlSystem", config)
        val girlActor: ActorRef = actorSystem.actorOf(Props(classOf[GirlActor]), "GirlActor")
        girlActor ! "start"
    }
}

class GirlActor extends Actor {
    override def receive: Receive = {
        case "start" =>
            println("小姐姐开始接客")
        case "小姐姐你好" =>
            sender() ! "你也好"
        
        case msg: String if msg.contains("女朋友") =>
            sender() ! "不好"
        
        case _ => sender() ! "abc"
    }
}
