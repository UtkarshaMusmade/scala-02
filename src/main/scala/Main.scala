object Main extends App {

  val m = new Max()

  val f = new Fibonacci()
  val s = new StringInterpolation()
  val sumofproduct= new SumOfProduct()
  println(m.max(List(1, 2, 3, 4, 5)))
  println(f.fib(4))
  s.strinterpolation(List(10, 20, 30, 40, 50))
  println(sumofproduct.product(5))
  println(sumofproduct.sum(sumofproduct.product(5),0))

}
