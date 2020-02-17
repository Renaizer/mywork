case class UserId(id:Int) extends AnyVal
case class UserName(name:String) extends AnyVal
case class TweetId(id:Int) extends AnyVal
case class TweetContent(content:String) extends AnyVal

case class User(id:UserId, name:UserName) 
case class Tweet(id:TweetId, content:TweetContent)


object Test2 extends App{

val user  = new User(UserId(1),UserName("Hamid"))
val tweet = new Tweet(TweetId(11),TweetContent("This is a new tweeet from Hamid"))

println(s"User Id: ${user.id}")
println(s"Tweet Id: ${tweet.id}")



}
