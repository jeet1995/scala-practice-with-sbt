package com.scalabook.examples.controlabstractions

object NewControlStructures {

  def twice(op: Double => Double, value: Double) = op(op(value))

}
