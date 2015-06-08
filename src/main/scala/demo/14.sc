
val fruits:List[String] = List("apples","oranges","pears")

val diag3:List[List[Int]] = List(List(0,1,0),List(1,0,1),List(1,1,0))

val empty:List[Nothing] = List()

"abc" :: ("xyz" :: Nil)

1::2::3::Nil


fruits.head
diag3.head


def isort(xs: List[Int]): List[Int]= xs match{
  case List() => List()
  case y :: ys => insert(y,isort(ys))
}

def insert(x: Int, xs: List[Int]):List[Int]= xs match{
  case List()=> List(x)
  case y:: ys => if(x <=y) x::xs else y:: insert(x,ys)
}

val list1 = List(1,2,3)
val list2 = List(5,6,7)
fruits.length
fruits.head
fruits.last
fruits.init
fruits take 1
fruits drop 1
fruits(1)
list1 ++ list2
list1.reverse
fruits.reverse

list2 updated (0,4)
list2 indexOf 6
list2 contains 3
