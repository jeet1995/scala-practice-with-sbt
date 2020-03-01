package com.scalabook.examples.controlabstractions

object Runner {

  def main(args: Array[String]): Unit = {

    val sum = CurryExample.curryAdd(1)(2)

    println("The sum is : " + sum)

    val sumV2 = CurryExample.curryAddV2(1)(2)

    println("The sum is : " + sumV2)

    val oneAddedTwice = NewControlStructures.twice(x => x + 1, 5)

    println("One added twice to 5 : " + oneAddedTwice)

    val twoMultipliedTwice = NewControlStructures.twice(_ * 2, 3)

    println("Two multiplied twice to 3 : " + twoMultipliedTwice)

    val isTrue = ByNameParameters.byNameAssert(5 > 3)

    println("Is 5 > 3? : " + isTrue)

    try {
      ByNameParameters.byNameAssert(3 > 5)
    } catch {
      case ae: AssertionError => println("An assertion error has occurred")
    }

  }

}
