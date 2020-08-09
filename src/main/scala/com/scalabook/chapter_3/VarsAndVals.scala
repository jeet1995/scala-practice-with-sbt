package com.scalabook.chapter_3

object VarsAndVals {
  def main(args: Array[String]): Unit = {

    // the reference of the array cannot be changed
    // but the values stored in the references
    // can be changed
    val strArray = new Array[String](5);

    strArray(0) = "A"
    strArray(1) = "B"

    strArray.foreach(println)
  }
}
