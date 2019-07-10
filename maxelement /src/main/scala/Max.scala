class Max {

  def max(xs: List[Int]): Int = {
    val head = xs.head
    val tail = xs.tail
    if (tail.isEmpty) head
    else {
      val m = max(tail)
      if (head >= m) head else m
    }
  }


}
