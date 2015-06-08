
def sum(xs:List[Int]): Int = xs match{
  case Nil => 0
  case y :: ys => y +sum(ys)
}

val list = List(1,2,3,4,5)
sum(list)

def sum1(xs: List[Int]):Int =
  //(0 :: xs) reduceLeft ((x,y)=> x + y)
  (0 :: xs) reduceLeft (_ + _)

def product(xs: List[Int]): Int=
  (1::xs) reduceLeft ((x,y)=> x * y)


def sum2(xs: List[Int]):Int =
//(0 :: xs) reduceLeft ((x,y)=> x + y)
  (xs foldLeft 0) (_ + _)

def product1(xs: List[Int]): Int=
  (xs foldLeft 1) (_ * _)

sum1(list)
product(list)
sum2(list)
product1(list)
