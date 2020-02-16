import scala.collection.mutable.ArrayBuffer


object test extends App{
  var PersonList = new ArrayBuffer[Person]()
  
  val person1 = Person("Hamid",10)
  val person2 = Person("javid",11)
  val person3 = Person("Sharu",12)
  
  
  PersonList ++= Array(person1, person2, person3)
//  print(person.display())
  
  for(singleperson <- PersonList)
    println(singleperson.display())
   
}
