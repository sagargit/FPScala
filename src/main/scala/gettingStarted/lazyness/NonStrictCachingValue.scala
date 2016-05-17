package gettingStarted.lazyness

/**
 * Created by sagarhp on 1/3/16.
 */
object NonStrictCachingValue extends App{

  def maybeTwice(b: Boolean, i: => Int) = {
    if(b){
       val j = i
      j + j + j
      //i+i
    }
    else{
      0
    }
  }

  val x = maybeTwice(true, { println("hi"); 1+41 })
  println(x)




}
