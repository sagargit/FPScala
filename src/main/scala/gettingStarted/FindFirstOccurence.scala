package gettingStarted

/**
 * Created by sagarhp on 12/13/15.
 */
object FindFirstOccurence extends App{

  def findFirst[A](list: List[A],p: A => Boolean): Int = {
    def loop(n: Int):Int = {
      if(n >= list.length) -1
       else if(p(list(n))) n
      else loop(n+1)
    }

    loop(0)
  }

  def isSorted[A](as: List[A], ordered: (A,A) => Boolean): Boolean = {

    def loop(n:Int):Boolean = {
      if(n >= as.length - 1) true // because we are accessing n and n+1 at the same time
      else if(!ordered(as(n),as(n+1))) false
      else loop(n+1)
    }

    loop(0)

  }

  val demoFunction = new Function2[Int,Int,Boolean] {
    def apply(x:Int,y: Int) = x < y
  }

  println(findFirst(List("sagar","ram","hari"),(x:String) => x.equalsIgnoreCase("ram")))
  println(findFirst(List(1,2,3,4,5),(x:Int)=> x ==3))

  println(isSorted(List(1,2,3,4,5),(x:Int,y:Int) => x < y))
  println(isSorted(List(1,2,5,3,4),(x:Int,y:Int) => x < y))
}
