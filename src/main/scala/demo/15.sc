//implementation of last method for list
def last[T](xs: List[T]):T = xs match{
  case List()=> throw new Error("last of empty list" )
  case List(x)=> x
  case y::ys => last(ys)
}
last(List(1,2,3))

//implementation of init method for list

def init[T](xs: List[T]):List[T]= xs match{
  case List() => throw new Error("init of empty list")
  case List(x)=> List()
  //case y::ys => (y :: ys).take((y::ys).length-1)
  case y::ys => y:: init(ys)
}
init(List(1,2,3))

//implementation of concate method
def concate[T](xs: List[T],ys: List[T]):List[T]=xs match{
  case List() => ys
  case z :: zs => z :: concate(zs, ys)
}

concate(List(3,4,5),List(6))
concate(List(),List(1,2))

//implementation of reverse method

def revers[T](xs: List[T]):List[T] = xs match{
  case List() => xs
  case y::ys =>  revers(ys) ++ List(y)
}

revers(List())
revers(List(1,2))

