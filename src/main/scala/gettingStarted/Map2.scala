package gettingStarted

/**
 * Created by sagarhp on 1/1/16.
 */
object Map2 extends App{

  def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C]={

    val res = a.flatMap(k => b.map(l => f(k,l)))
    res

  }

  def sequence[A](a: List[Option[A]]): Option[List[A]] = {
    a match {
      case Nil => Some(Nil)

      case x::xs => x.flatMap( k=> sequence(xs).map(l => k :: l))
    }


  }

}
