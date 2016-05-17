package gettingStarted.lazyness

/**
 * Created by sagarhp on 1/3/16.
 */
object NonStrict extends App {

  def if2[A](cond: Boolean, onTrue: => A, onFalse: => A): A =
    if (cond) onTrue else onFalse

  if2(false, sys.error("fail"), 3)
}
