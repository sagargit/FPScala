package gettingStarted

/**
 * Created by sagarhp on 12/13/15.
 */
object HOF extends App{

  def factorial(n: Int):Int = {
    def go(num: Int, acc: Int):Int = {
      if(num<=0) acc
      else go(num-1,num * acc)
    }
    go(n,1)
  }

  def abs(n: Int): Int = {
    if(n>0) n
    else -n
  }

  def formatResult(opName: String,number: Int, fun: Int => Int) = {
    val message = "the %s of %d is %d"
    message.format(opName,number,fun(number))

  }

  println(formatResult("factorial",5,factorial))
  println(formatResult("absolute Value",-3,abs))

}
