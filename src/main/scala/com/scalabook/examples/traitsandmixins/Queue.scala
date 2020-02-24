package com.scalabook.examples.traitsandmixins

import scala.collection.mutable.ArrayBuffer

trait Queue[T] {

  def add(value: T)

  def remove: T

}

trait LoggingIntQueue extends Queue[Int] {

  private def log(value: Int) = println("The logged value is : " + value)

  abstract override def add(value: Int): Unit = {
    println("In logging queue in add method")
    super.add(value)
    log(value)
  }

  abstract override def remove: Int = {
    println("In logging queue in remove method")
    val value = super.remove
    log(value)
    value
  }
}

trait SynchronizedIntQueue extends Queue[Int] {

  abstract override def add(value: Int): Unit = synchronized {
    println("In synchronized queue in add method")
    super.add(value)
  }

  abstract override def remove: Int = synchronized {
    println("In synchronized queue in remove method")
    super.remove
  }
}

class StandardQueue extends Queue[Int] {

  private val arrayBuffer = new ArrayBuffer[Int]()

  override def add(value: Int): Unit = arrayBuffer.append(value)

  override def remove: Int = arrayBuffer.remove(0)
}