package com.scalabook.examples.classesandobjects

/**
  * A class that calculates the check sum of bytes. This class
  * is not thread safe.
  **/
class CheckSumCalculator {

  private var sum = 0

  /**
    * Adds the passed <Code>Byte</Code> to the checksum
    *
    * @param b the <Code>Byte</Code> to add.
    **/
  def add(b: Byte): Unit = sum += b

  /** Gets a checksum for all the <Code>Byte</Code>s passed
    * to <Code>add</Code>. The sum of the integer
    * returned by this method, when added to the
    * sum of all the passed bytes will yield zero.
    */
  def checksum: Int = ~(sum & 0xFF) + 1
}


/**
  * Singleton object to class <Code>CheckSumCalculator</Code>
  **/
object CheckSumCalculator {

  def calcChecksum(s: String): Int = {

    val cc = new CheckSumCalculator
    s.foreach(c => cc.add(c.asInstanceOf[Byte]))
    cc.checksum

  }
}