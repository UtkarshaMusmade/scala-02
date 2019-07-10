class SumOfProduct {

  def product(num :Int):Int= if(num<=0) 1 else num*product(num-1)
  def sum(num:Int,sum1 :Int):Int={

    if(num<=0) sum1
    else{

      sum(num/10,(num%10)+sum1)
    }




  }


}
