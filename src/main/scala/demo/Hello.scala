package demo

 class Rational(x: Int, y: Int){
  require(y !=0,"denominator must be nonzero")
  private def gcd(a: Int,b: Int):Int=
    if(b==0) a else gcd(b,a%b)

  //second constructor
  def this(x: Int) = this(x,1)

  def numer=x
  def denom=y
  def +(r: Rational):Rational=
    new Rational(r.numer * denom + numer * r.denom,r.denom*denom)

  def unary_- : Rational= new Rational(-numer,denom)

  def < (that: Rational)= numer * that.denom < that.numer * denom

  def max(that: Rational)=if(this < that) that else this

  override def toString= {
    val g = gcd(numer, denom)
    numer / g + "/" + denom / g
  }

  def -(that: Rational)=
    this + -that
}

