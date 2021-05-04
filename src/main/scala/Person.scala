case class Person(fname: String, lname: String, age: Int) {

  val description=s"$fname $lname is $age years old"
}

object Person {

  def filterAdult(persons: List[Person]): List[Person]=persons.filter(_.age >= 18)
}
