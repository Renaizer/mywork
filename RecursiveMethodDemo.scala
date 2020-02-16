

object RecursiveMethodDemo extends App{
  
  def recursiveSum(value:Int*):Int={
    if(value.length <=1) value.head
    else value.head + recursiveSum(value.tail:_*)    
  }
  
  
  print(recursiveSum(1,2,3,4,5,6,7))
  
}RecursiveMethodDemo.scalaRecursiveMethodDemo.scala
