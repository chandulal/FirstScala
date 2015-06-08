//Higher Order Functions

def sumInts(a: Int, b: Int):Int={
  if(a>b) 0 else a+sumInts(a+1,b)
}

def cube(a: Int)= a*a*a
def sumCubes(a:Int,b: Int): Int={
  if(a>b) 0 else cube(a) + sumCubes(a+1,b)
}

sumCubes(1,3)

def sumFactorial(a: Int, b: Int):Int={
  if(a>b) 0 else factorial(a)+sumFactorial(a+1,b)
}

def factorial(number: Int):Int={
  if(number==1) 1 else number*factorial(number-1)
}

sumFactorial(1,3)

//using higher order function

def sum(f: Int => Int,a: Int,b: Int):Int={
  if(a>b) 0
  else f(a) + sum(f,a+1,b)
}

def sum1(f: Int=>Int,a: Int,b: Int):Int={
  def loop(a: Int,acc: Int):Int=
   if(a>b) acc
  else loop(a+1,f(a)+acc)
  loop(a,0)
}

def sumInts1(a: Int,b: Int) = sum(id,a,b)
def sumCubes1(a: Int,b: Int) = sum(cube,a,b)
def sumFactorial1(a:Int,b: Int) =sum(factorial,a,b)

def id(x: Int)=x

//anonymous function
def sumInts12(a: Int,b: Int) = sum(x=>x,a,b)
def sumCubes2(a: Int,b: Int) = sum(x=>x*x*x,a,b)
def sumFactorial2(a:Int,b: Int) =sum1(factorial,a,b)