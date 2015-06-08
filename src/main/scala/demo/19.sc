//applying function to list elements

def scaleList(xs: List[Double],factor: Double):List[Double]=xs match{
  case Nil => xs
  case y::ys => y * factor :: scaleList(ys,factor)
}

val list = List(2.0,3.0)
scaleList(list,3.0)

