
//carrying
def sum(f: Int => Int): (Int,Int)=>Int={
  def sumF(a: Int, b:Int): Int=
  if(a>b) 0
  else f(a)+ sumF(a+1,b)
  sumF
}

//sugar

def sum1(f: Int=>Int)(a:Int,b:Int):Int=
if(a>b) 0 else f(a)+ sum1(f)(a+1,b)

def sumInts = sum(x=>x)
def sumCubes = sum(x=> x * x * x)
sumInts(1,5)
sumCubes(1,5)

def cube(x: Int):Int = x*x*x

sum (cube) (1,5)
sum1 (cube) (1,5)


def product(f:Int => Int):(Int,Int)=>Int={
  def prodF(a: Int, b: Int): Int=
  if(a>b) 1
  else
    f(a)*prodF(a+1,b)
  prodF
}

def prodInt = product(x=>x)

prodInt(1,3)

def factorial(num: Int):Int=
prodInt(1,num)
factorial(4)






