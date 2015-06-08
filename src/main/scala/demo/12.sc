
trait Expr{
  def isNumber:Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
  def evel:Int
}

class Number(n: Int) extends Expr{
  def isNumber:Boolean=true
  def isSum:Boolean=false
  def numValue:Int=n
  def leftOp:Expr = throw new Error("Number.leftOp")
  def rightOp:Expr=throw new Error("Number.rightOp")
  def evel:Int = n
}

class Sum(e1: Expr, e2: Expr) extends Expr{
  def isNumber:Boolean=false
  def isSum:Boolean=true
  def numValue:Int= throw new Error("Sum.numValue")
  def leftOp:Expr = e1
  def rightOp:Expr= e2
  def evel:Int =e1.evel + e2.evel
}

def eval(e: Expr): Int={
  if(e.isInstanceOf[Number]) e.asInstanceOf[Number].numValue
  else if(e.isInstanceOf[Sum]) eval(e.asInstanceOf[Sum].leftOp) + eval(e.asInstanceOf[Sum].rightOp)
  else throw new Error("Unknown Expression " + e)
}

eval(new Sum(new Number(1),new Number(2)))
