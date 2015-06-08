//implicit arguments

def msortParam[T](xs: List[T])(lt: (T,T)=>Boolean):List[T]={
  val n =xs.length/2
  if(n==0) xs
  else{
    def merge(xs:List[T],ys: List[T]): List[T]= (xs,ys) match{
      case(Nil,ys)=>ys
      case(xs,Nil)=>xs
      case(x::xs1,y::ys1) =>
        if(lt(x,y)) x :: merge(xs1,ys)
        else y :: merge(xs,ys1)
    }
    val (fst,snd) =xs splitAt n
    merge(msortParam(fst)(lt),msortParam(snd)(lt))
  }
}

val nums =  List(2,-4,7,8,1)
msortParam(nums)((x, y) => x < y )

val fruits = List("apple","pineapple","orange","banana")

msortParam(fruits)((x:String,y: String)=> x.compareTo(y)<0)

