package com.scalabook.chapter_3

import scala.collection.mutable

object SetsAndMaps {
  def main(args: Array[String]): Unit = {

    val set = new mutable.HashSet[String]

    set.+=("Brent", "Stephens")

    set.foreach(println)

    val map = new mutable.HashMap[String, Int]

    // adding a key-value pair
    map.+=("1" -> 1, "2" -> 2)

    map.foreach(entry => println(entry._1 + ":" + entry._2))
  }
}
