object Main extends App {

  val persons = List(
    Person(fname="Akira", lname="Kurosawa", age=92),
    Person(fname="Peter", lname="Nicosavatis", age=15),
    Person(fname="Nick", lname="Mason", age=65)
  )

  val adults=Person.filterAdult(persons)
  val descriptions=adults.map(x=>x.description).mkString("\n\t")
  println(s"The adults are \n\t$descriptions")

}
