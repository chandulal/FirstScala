val fruit = Set("apple","banana","pear")
val s=(1 to 6).toSet

s map (_ + 2)
s.nonEmpty

//n-queen problem

def queens(n: Int): Set[List[Int]]={
  def placeQueens(k: Int): Set[List[Int]]=
    if(k==0) Set(List())
  else
    for{
      queens <- placeQueens(k -1)
      col <- 0 until n
      if isSafe(col, queens)
    }yield col :: queens

  def isSafe(col: Int, queens:List[Int]):Boolean={
     val row =queens.length
    val queenWithRow=(row-1 to 0 by -1) zip queens
    queenWithRow forall{
      case(r,c) => col !=c && Math.abs(col-c) != row-r
    }
  }
  placeQueens(n)
}
def show(queens: List[Int])={
  val lines =
  for(col<- queens.reverse)
    yield Vector.fill(queens.length)("* ").updated(col,"X ").mkString
  "\n" + (lines mkString "\n")
}

queens(4) map show
queens(8) 