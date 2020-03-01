package com.scalabook.examples.controlabstractions

object ByNameParameters {

  val assertionEnabled = true

  def byNameAssert(predicate: => Boolean) = {
    if (assertionEnabled && !predicate)
      throw new AssertionError
    predicate
  }

}
