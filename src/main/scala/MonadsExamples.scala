object MonadsExamples {

  def main(args: Array[String]): Unit = {

    val listOne = List(1, 2, 4, 7, 19)

    // map takes one container and converts it to another by taking a lambda function
    val squaresOfListOne = listOne.map(a => a * a)

    // output
    squaresOfListOne.foreach(println)

    val sumOfSquares = squaresOfListOne.foldLeft(0)((a, b) => a + b)
    val productOfSquares = squaresOfListOne.product

    println("Sum of squares : " + sumOfSquares)
    println("Product of squares : " + productOfSquares)

  }

}



