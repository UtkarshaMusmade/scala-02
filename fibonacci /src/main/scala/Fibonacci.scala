class Fibonacci {


def fib(num:Int):Int = {

  def fibo(num1:Int, a:Int,b:Int): Int =
  {

    if(num1==0)
      a

      else
      fibo(num1-1,b,a+b)

  }
   fibo(num,0,1)


}

}
