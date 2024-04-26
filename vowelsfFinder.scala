/*problem Statement
A string is considered beautiful if it satisfies the following conditions:
Each of the 5 English vowels ('a', 'e', 'i', 'o', 'u') must appear at least once in it.
The letters must be sorted in alphabetical order (i.e. all 'a's before 'e's, all 'e's before 'i's, etc.).
For example, strings "aeiou" and "aaaaaaeiiiioou" are considered beautiful, but "uaeio", "aeoiu", and "aaaeeeooo" are not beautiful.
Given a string word consisting of English vowels, return the length of the longest beautiful substring of word. If no such substring exists, return 0.
A substring is a contiguous sequence of characters in a string.
 
Example 1:
Input: word = "aeiaaioaaaaeiiiiouuuooaauuaeiuaaaaeiiiiouuuuuuuuuuuuuuu"
Output: 13
Explanation: The longest beautiful substring in word is "aaaaeiiiiouuu" of length 13.
Example 2:
Input: word = "aeeeiiiioooauuuaeiou"
Output: 5
Explanation: The longest beautiful substring in word is "aeiou" of length 5.
Example 3:
Input: word = "a"
Output: 0
Explanation: There is no beautiful substring, so return 0.
*/


// To solve this problem I started with traversing each element in the source string and identifying each element if it satisies the beutifull string criteria
// Below was the code I tried during the interview

  def checkifbeutiful( source:String):Int={
    val a:List[Char] = List('a', 'e', 'i','o','u')


    var index:Int = 0
    var maxIndexvalue = 0
    var lastElement:String = ""

    source.foreach(ele => {
      a contains ele match{
        case true =>
          lastElement.isEmpty match {
            case true =>
                      lastElement = ele.toString
                      index = index + 1
            case false =>
                      if(lastElement == ele.toString){
                        index = index + 1
                      }
                      else if((a.indexOf(ele) - 1)  == a.indexOf(lastElement.charAt(0))){
                        index = index + 1
                      }
                      else if(lastElement.charAt(0) == a(4)){
                        maxIndexvalue = index
                      }
                      else
                      {
                        index = 0
                      }
          }
        case false =>

      }
    })
    maxIndexvalue
  }



//However I could not get the right answers at that point
//After the interview when I was having discussion with Shaharukh, he suggested that we can use regular expression to solve this problem
//Then I wrote below code that gave me exact solution


  def checkBeutiful3(source:String) : Int ={
    val pat = """(a+e+i+o+u+)""".r

    val res0= pat.findAllIn(source).map(_.size)
    val res = res0.isEmpty match{
      case true => 0
      case false => res0.max
    }

    res
  }
