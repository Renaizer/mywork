/*
Puzzle: Rama started on a quest of visiting temples, with few coins in his pockets. 
As soon as he visits any temple, the money in his pocket gets doubled and on his way out, 
he donates Rs. 100 to each temple. 
He visits 4 temples on his quest. After visiting the last temple, his pocket is empty of all the money. 
So how much money he had initially.
*/

object scenario extends App{


  //synchronous code
  private def checkCompute(fix: Float): List[(Float, Boolean)] = {

    def compute(value: Float): Boolean = {
      value * 16 - fix * 15 == 0
    }

    (0 to 10000).map(_.toFloat / 100).map(x => (x, x)).map(x => (x._1, compute(x._2))).filter(_._2).toList
  }


  val starT=System.nanoTime()

    (0 to 10000).map(_.toFloat/100).map(x => (x,x)).map(x=>(x._1,checkCompute(x._2))).filter(_._2.nonEmpty).foreach(println)

  val endT=System.nanoTime()

  val benchM = endT - starT

  println(s"benchMark = ${benchM}")
  //benchMark = 1340271500 => ~ 1.34 Sec
  // 10000 * 10000 ~ 10^8 ~ iterations

// Need to implement in the Zio fibers to check the performance improvement
