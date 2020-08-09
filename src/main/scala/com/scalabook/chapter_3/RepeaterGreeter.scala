
class RepeaterGreeter(private val greeting: String, private val count: Int) {

  def this(greeting: String) = this(greeting, 1)

  def greet(): Unit = {
    (1 to count)
      .foreach(_ => println(greeting))
  }
}

// companion object
object RepeaterGreeter {

  def main(args: Array[String]): Unit = {

    val repeaterGreeter1 = new RepeaterGreeter("Hello World", 3)
    repeaterGreeter1.greet()
    val repeaterGreeter2 = new RepeaterGreeter("Hi!")
    repeaterGreeter2.greet()
  }
}