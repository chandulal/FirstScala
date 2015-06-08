//map, flatmap and filter

def mapFun[T,U](xs: List[T], f: T=>U): List[U]=
for(x <-xs) yield  f(x)

def flatMap[T,U](xs: List[T],f: T => Iterable[U]):List[U]=
for(x<-xs; y<-f(x)) yield y

def filter[T](xs: List[T],p: T=> Boolean): List[T]=
for(x<-xs if p(x)) yield x

//Map

val romanNumerals = Map("I"->1,"V"->5,"X"->10)
val capitalOfCountry = Map("US"->"Washington","Switzerland"->"Bern")

capitalOfCountry("US")
capitalOfCountry get "US"
capitalOfCountry get "Andorra"

//Option Type

def showCapital(country: String)=capitalOfCountry.get(country) match {
  case Some(capital)=> capital
  case None => "missing data"
}

showCapital("US")
showCapital("Andorra")

//Sorted and GroupBy

val fruits = List("apple","pear","orange","pineapple")

fruits sortWith (_.length < _.length)
fruits sorted

fruits groupBy(_.head)

