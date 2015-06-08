import demo.Hello
import sun.jvm.hotspot.runtime.amd64.AMD64CurrentFrameGuess


def sqrt(x: Double)=
  {
    def sqrIter(guess: Double):Double =
      if(isGoodGuess(guess)) guess
      else sqrIter(improve(guess))

    def isGoodGuess(guess: Double)=
      abs(guess * guess - x)/x < 0.001


    def abs(value: Double)=
      if(value<0) -value else value

    def improve(guess: Double)=
      (guess + x/guess)/2
    sqrIter(1.0)
  }

sqrt(2)
sqrt(25)
sqrt(1e-6)




