import scala.annotation.tailrec


object myUtils
{
 @tailrec private def sum(input:Seq[Int], accumulator:BigInt): BigInt = {
   if(input.isEmpty) accumulator else sum(input.tail, input.head + accumulator)
  }
 
 def recursiveSum(start:Int,end:Int):BigInt={
   sum(start to end,0)
 }
 
 def SumWithLoop(start:Int,end:Int):BigInt={
   var accumulators:BigInt = 0
   for(i <- start to end)
     accumulators += i
   
   accumulators
 }
 
 
}


object Test2 extends App{

myUtils

val starttime= System.nanoTime()
val RecursiveSumResult = myUtils.recursiveSum(1, 10000000)
val endtime =System.nanoTime()

val starttime2= System.nanoTime()
val SumResult = myUtils.SumWithLoop(1, 10000000)
val endtime2 =System.nanoTime()






println(RecursiveSumResult+" == WITH RECURSION ==> "+(endtime-starttime))
println(SumResult+" == WITH LOOP ==> "+(endtime2-starttime2))

println("Difference is : "+ ((endtime-starttime)-(endtime2-starttime2)))

//here are the results found after loop execution and recursion execution
//Tail Recursion outperformed 


//50000005000000 == WITH RECURSION ==> 856785263
//50000005000000 == WITH LOOP ==> 533584721
//Difference is : 323200542


}