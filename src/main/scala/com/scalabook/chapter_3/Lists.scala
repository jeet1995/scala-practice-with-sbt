package com.scalabook.chapter_3

object Lists {

  def main(args: Array[String]): Unit = {
    val listOne = List[Int](1, 2, 3)
    val listTwo = List[Int](-3, -2, -1, 0)
    // as lists are immutable, a new list is created
    // listTwo is prepended to listOne
    val listThree = listTwo ::: listOne
    listThree.foreach(println)
  }

}
