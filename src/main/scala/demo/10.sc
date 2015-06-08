//function as object
trait Function1[A,B]{
  def apply(x: A):B
}
//anonymouse function
{
  class AnonFun extends Function1[Int,Int]{
    def apply(x: Int) = x*x
  }
  new AnonFun
}

new Function1[Int,Int]{
  def apply(x: Int)=x*x
}
val f = (x: Int)=>x*x
f(6)

val f1 = new Function1[Int,Int]{
  def apply(x: Int)=x * x
}
f1.apply(7)


def mul(x: Int, y :Int)=
  x * y
val fmul = (x :Int, y :Int) => mul(x,y)
new Function2[Int,Int,Int] {
  override def apply(x: Int, y: Int): Int =x * y
}
fmul.apply(5,7)

//

trait List[T]{
  def isEmpty : Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T,val tail :List[T]) extends List[T]{
  def isEmpty=false
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head:Nothing = throw new NoSuchElementException("Nil.head")
  def tail:Nothing=throw new NoSuchElementException("Nil.tail")
}

object List{
  def apply[T](x1: T,x2: T)=new Cons(x1, new Cons(x2,new Nil))
  def apply()=new Nil
}

List(1,2)

