//vector,sequence and range

val nums = Vector(1,2,-4,5,3)

/* Iterable is a super class for collection
 Iterable have three sub class:
  -Seq
  -Set
  -Map

Seq have three sub class: 1) List 2) Vector 3) Range

Addition with that we have Array and String
*/

val xs = Array(1,2,3,44)

xs map (x => x*2)
val s ="Hello World"
s filter (c => c.isUpper)
s exists (c => c.isUpper)
s forall(c => c.isUpper)

val x: Range = 1 to 5
val y: Range = 1 until 5
val z: Range = 1 to 11 by 3
val p: Range = 6 to 1 by -2

val pairs =List(1,2,3) zip  s
pairs.unzip

s flatMap (c => List('.',c))

xs.sum
xs.max
xs.product
xs.min

val a = Vector(1.0,2.0)
val b =Vector(2.0,3.0)
def scalarProduct(xs: Vector[Double],ys: Vector[Double]):Double=
  (xs zip ys).map(xy => xy._1 * xy._2).sum

scalarProduct(a,b)

