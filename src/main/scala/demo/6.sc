//function and data

class Rational(x: Int, y: Int){

  require(y !=0,"denominator must be nonzero")
  private def gcd(a: Int,b: Int):Int=
    if(b==0) a else gcd(b,a%b)

  //second constructor
  def this(x: Int) = this(x,1)

  def numer=x
  def denom=y
  def add(r: Rational):Rational=
  new Rational(r.numer * denom + numer * r.denom,r.denom*denom)

  def neg:Rational=
  new Rational(-numer,denom)

  def less(that: Rational)= numer * that.denom < that.numer * denom

  def max(that: Rational)=if(this.less(that)) that else this

  override def toString=
  val g =gcd(numer,denom)
  numer/g+"/"+denom/g

  def sub(that: Rational)=
    add(that.neg)
}

val x = new Rational(1,3)
val y = new Rational(5,7)
val z = new Rational(3,2)
new Rational(2)
x.add(y)
x.sub(y).sub(z)
y.add(y)
x.less(y)
x.max(y)

