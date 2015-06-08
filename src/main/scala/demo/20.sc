def squareList(xs:List[Int]):List[Int]=xs match{
  case Nil => Nil
  case y :: ys => y * y :: squareList(ys)
}

squareList(List(1,2,3))


def squareList2(xs: List[Int]): List[Int]=
xs map (x=>x*x)

squareList2(List(1,2,3))

//filtering

def posElems(xs: List[Int]):List[Int]= xs match{
  case Nil => xs
  case y::ys => if(y>0) y:: posElems(ys) else posElems(ys)
}

posElems(List(-5,3,6,-2,0,1))


def posElems2(xs: List[Int]):List[Int]=
xs filter (x => x>0)

def partition(xs: List[Int]):(List[Int], List[Int])=
xs partition (x => x>0)

def twhile(xs: List[Int]):List[Int]=
xs takeWhile(x => x >0)


posElems2(List(-5,3,6,-2,0,1))
partition(List(-5,3,6,-2,0,1))
twhile(List(5,3,-6,-2,0,1))
