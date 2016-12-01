package Chapter7

object test extends App {
  var a=new Employee()
//  var a=""
  println(a.isInstanceOf[Employee])
   println(a.isInstanceOf[Person])
    println(a.isInstanceOf[Employer])
//  for ()
  var b=a.asInstanceOf[Employee]
  println(b)
  println(a.asInstanceOf[Person].getClass)
//    println(a.asInstanceOf[Employer].getClass)
  println(a.getClass==classOf[Employee])
  println(a.getClass==classOf[Person])
  println(a.getClass==classOf[Employer])
}

class Employee extends Person{

}

class Person{

}
class Employer extends{}