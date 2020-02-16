class Person private(val name:String, val age:Int){
  def display()={
    s"Hello $name, you are $age now"
  }
  
}
object Person
{
  def apply(name:String, age:Int) = 
    new Person(name,age)
  }
