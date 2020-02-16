

object RecursiveMethodDemo extends App{
  
  def recursiveSum(value:Int*):Int={
    if(value.length <=1) value.head
    else value.head + recursiveSum(value.tail:_*)    
  }
  
  
  print(recursiveSum(1,2,3,4,5,6,7))  // This is a sequence of Integer that is not generated before passing the argument to method
  print(recursiveSum(1 to 7:_*))      
  // 1 to 7 method had already generated a sequence of elements before passing it to method. 
  // Hence :_* operator is required in Scala to treat compensate the difference
  
}
