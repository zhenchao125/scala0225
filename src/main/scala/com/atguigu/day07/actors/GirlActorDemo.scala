package com.atguigu.day07.actors

import akka.actor.Actor


class GirlActor extends Actor {
    override def receive: Receive = {
        case "小姐姐你好" =>
            sender() ! "你也好"
        
        case msg: String if msg.contains("女朋友") =>
            sender() ! "不好"
        
        case _ => sender() ! "abc"
    }
}
