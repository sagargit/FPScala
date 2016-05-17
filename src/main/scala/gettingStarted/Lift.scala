package gettingStarted

/**
 * Created by sagarhp on 1/1/16.
 */
object Lift extends App{

  val partial = new PartialFunction[Int,Int] {

    def isDefinedAt(a:Int) = a> 0

    def apply(x:Int) =  x + 1
  }

  val liftPartial = partial.lift

  println(partial(5))
  println(liftPartial(5))



}
