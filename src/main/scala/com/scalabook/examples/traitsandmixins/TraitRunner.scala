package com.scalabook.examples.traitsandmixins

object TraitRunner {

  def main(args: Array[String]): Unit = {

    val book1 = new Book("JK Rowling", "Harry Potter and the Goblet of Fire")
    val book2 = new Book("Dan Brown", "Angels and Demons")

    println(book1 < book2)
    println(book1 > book2)

    // Linearization happens from back to front
    val queueWithLoggingAndSynchronization = new StandardQueue with LoggingIntQueue with SynchronizedIntQueue

    queueWithLoggingAndSynchronization.add(5)
    queueWithLoggingAndSynchronization.add(6)
    queueWithLoggingAndSynchronization.add(7)

    queueWithLoggingAndSynchronization.remove
  }

}
