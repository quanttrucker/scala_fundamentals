import org.scalatest._
import org.scalatest.matchers.should.Matchers
import wordspec._

class MainSpec extends AnyWordSpec with Matchers {

  "A Person" should {

    //Test 1
    "be instantiated with an age and a name" in {
      val john = Person(fname = "John", lname = "Smith", age = 42)
      john.fname should be("John")
      john.lname should be("Smith")
      john.age should be(42)
    }

    //Test 2
    "Get a description of the Person" in {

      val paul = Person(fname = "Paul", lname = "Newcombe", age = 52)
      paul.description should be("Paul Newcombe is 52 years old")

    }

  }

  "The Person companion object" should{

    val (akira, peter, nick)=(
      Person(fname="Akira", lname="Kurosawa", age=92),
      Person(fname="Peter", lname="Nicosavatis", age=15),
      Person(fname="Nick", lname="Mason", age=65)
    )

    "return a list of adult persons" in {
      val ref=List(akira, peter, nick)
      Person.filterAdult(ref) should be (List(akira, nick))
    }


  }


}
