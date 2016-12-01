package Chapter13

object Chapter130 extends App {
  println(Map("B"->3,"a"->4).get("a"))
  println(Map("B"->3,"a"->4)("a"))
}