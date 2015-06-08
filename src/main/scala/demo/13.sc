import java.beans.Expression

//pattern matching
trait Expr{
  def isNumber:Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
  def evel:Int=this match{
    case Number(n) => n
    case Sum(e1,e2)=>e1.evel + e2.evel
  }
  def show(e: Expr):String= this match{
    case Number(n) => n.toString
    case Sum(e1,e2) => show(e1) + " + "+ show(e2)
  }
}

case class Number(n: Int) extends Expr{
  def isNumber:Boolean=true
  def isSum:Boolean=false
  def numValue:Int=n
  def leftOp:Expr = throw new Error("Number.leftOp")
  def rightOp:Expr=throw new Error("Number.rightOp")
}

case class Sum(e1: Expr, e2: Expr) extends Expr{
  def isNumber:Boolean=false
  def isSum:Boolean=true
  def numValue:Int= throw new Error("Sum.numValue")
  def leftOp:Expr = e1
  def rightOp:Expr= e2
}



