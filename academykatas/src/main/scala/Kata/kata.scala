package Kata

object kata extends App {

  def makeList (Number: Int) : List[Int] = {
    val y = (0 to Number).toList.reverse
    y
  }
  println(makeList(5))


  val x = List.fill(3)("Hello")
  println(x)
}
