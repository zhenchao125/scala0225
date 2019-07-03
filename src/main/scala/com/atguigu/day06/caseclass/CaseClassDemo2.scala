package com.atguigu.day06.caseclass

/**
  * Author lzc
  * Date 2019-07-03 10:54
  */
object CaseClassDemo2 {
    def main(args: Array[String]): Unit = {
        //        val itme = Book(100)
        val bundle1 = Bundle(20, Book(100), Book(200))
        val bundle2 = Bundle(20, Book(100), Book(200), bundle1)
        println(calcPrice(bundle1))
        println(calcPrice(bundle2))
    }
    
    def calcPrice(item: Item): Double = {
        item match {
            case Book(price) => price
            case Bundle(discount, items@_*) => {
                items.map(calcPrice).sum - discount
            }
        }
    }
    
    // 用来计算 item的价格的
    def calcPrice1(item: Item): Double = {
        
        item match {
            case Book(price) => price
            case Bundle(discount, items@_*) => {
                items.foldLeft(-discount)((money, item) => {
                    money + calcPrice1(item) // 递归
                })
            }
        }
    }
    
    
}


// 做封装
abstract class Item

case class Book(price: Double) extends Item

case class Bundle(discount: Double, items: Item*) extends Item