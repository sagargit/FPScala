package gettingStarted

/**
 * Created by sagarhp on 12/15/15.
 */
object ComposeObj extends App{

  val f1 = (x:Int) => x + 2
  val f2 = (y:Int) => y * y

  val f3 = f1 compose f2

  val f4 = f2 compose f1

  val f5 = f1 andThen f2

  val f6 = f2 andThen f1

  println(f3(10))
  println(f4(10))
  println(f5(10))
  println(f6(10))

}
