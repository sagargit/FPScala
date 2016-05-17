package gettingStarted

/**
 * Created by sagarhp on 12/15/15.
 */
object Polymorphic {


  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
     a:A => b:B => f(a,b)
  }

/*  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a:A,b:B) => f(a)
  }*/

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    (a:A) => f(g(a))
  }

  val list = List(1,2)
 // list.foldRight()
}
