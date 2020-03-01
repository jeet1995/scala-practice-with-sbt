package com.scalabook.examples.controlabstractions

object CurryExample {

  // Currying
  def curryAdd(x: Int)(y: Int) = x + y

  def curryAddV2(x: Int) = (y: Int) => x + y

}

