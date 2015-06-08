import java.util.NoSuchElementException

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


def singleTon[T](elem: T) = new Cons[T](elem,new Nil[T])

singleTon[Int](1)
singleTon[Boolean](true)


def nth[T](n:Int,xs:List[T]):T=
if(xs.isEmpty) throw new ArrayIndexOutOfBoundsException
  else if(n==0)  xs.head
  else nth(n-1,xs.tail)

val list = new Cons(1,new Cons(2,new Cons(3,new Nil)))
nth(2,list)
nth(-1,list)


