object HigherOrderFunctions {

  def main(args: Array[String]): Unit = {

    val sumOfList = func[Int](0, List(1, 2, 3), (a: Int, b: Int) => a + b)
    val productOfList = func[Int](1, List(1, 2, 3, 6, 9), (a, b) => a * b)

    println("Sum of list : " + sumOfList)
    println("Product of list : " + productOfList)
  }

  def func[A](start: A, a: List[A], f1: (A, A) => A): A = a.foldLeft(start)((b, c) => f1(b, c))

}
