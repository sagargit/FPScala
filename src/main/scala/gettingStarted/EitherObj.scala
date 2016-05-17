package gettingStarted

/**
 * Created by sagarhp on 1/1/16.
 */
object EitherObj extends App{

  def safeDivide(x:Int,y:Int):Either[Exception,Int]  = {
    try{
      Right(x/y)
    }
    catch{
      case e:Exception => Left(e)
    }
  }

  safeDivide(3,4).fold(
  left =>
    {
      println("Exception has been thrown: "+left.getLocalizedMessage)
    },
  right =>
    {
      println("Divide operation successful: "+ right)
    }
  )

}
