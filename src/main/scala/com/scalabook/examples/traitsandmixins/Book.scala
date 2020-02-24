package com.scalabook.examples.traitsandmixins

class Book(val author: String, val title: String) extends Ordered[Book] {

  override def compare(that: Book): Int = {

    if (this.author < that.author) -1
    else if (this.author > that.author) 1
    else if (this.title < that.title) -1
    else if (this.title > that.title) 1
    else 0
  }
}


