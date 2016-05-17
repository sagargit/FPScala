package gettingStarted.lazyness

/**
 * Created by sagarhp on 1/3/16.
 */
object ValVsLazyVal extends App{

  val res = {
              println("hi")
              1+41
            }

  lazy val result = { println("hello"); 82 }


}
