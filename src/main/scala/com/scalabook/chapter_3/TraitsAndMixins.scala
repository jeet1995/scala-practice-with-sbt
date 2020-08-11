package com.scalabook.chapter_3

trait BaseGreeterTrait {
  def greet() = "Hi"
}

class Greeter extends BaseGreeterTrait {
  override def greet(): String = "Good morning"
}

class Dog extends BaseGreeterTrait {
  override def greet(): String = "Woof"
}

trait ExclamatoryGreeter extends BaseGreeterTrait {
  override def greet(): String = super.greet() + "!"
}

object TraitsAndMixins {

  def main(args: Array[String]): Unit = {
    val greeter: BaseGreeterTrait = new Greeter
    // because of dynamic dispatch, greet on dynamic type is invoked
    // hence the output is "Good morning"
    println(greeter.greet)

    // a synthetic class is created here - essentially a mixin
    val dog: Dog = new Dog with ExclamatoryGreeter
    println(dog.greet)
  }

}
