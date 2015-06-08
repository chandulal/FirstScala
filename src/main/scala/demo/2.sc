import scala.annotation.tailrec

def gcd(firstNum: Int, secondNum: Int): Int=
if(secondNum==0) firstNum else gcd(secondNum,firstNum % secondNum)

gcd(5,10)
gcd(14,21)


def factorial(number :Int):Int=
if(number==1) 1 else number * factorial(number-1)

factorial(3)

def factorialRec(number : Int):Int={
  @tailrec
  def loop(acc :Int, number :Int):Int=
    if(number ==0) acc
    else loop(acc * number,number-1)

    loop(1,number)
}

factorialRec(3)
