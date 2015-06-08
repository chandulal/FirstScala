//prime number program

def isPrime(num: Int): Boolean =
  (2 until num) forall( d => num % d !=0)

isPrime(7)

val n =7

(1 until n) flatMap  (i =>
  (1 until i) map (j=> (i,j))
  ) filter(pair => isPrime(pair._1+pair._2))


//for expression

for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i+j)
} yield (i,j)

case class Person(name: String,age: Int)

val  persons:Array[Person]=Array(new Person("chetan",25)
,new Person("anil",19))

//find people, age more than 20
 for(p <- persons if p.age >20) yield p.name
//or
persons filter(p=> p.age>20) map (p=> p.name)

//scalar product

def scalarProduct(xs:List[Double],ys: List[Double]):Double=
  (for((x,y) <- xs zip ys) yield x * y).sum

