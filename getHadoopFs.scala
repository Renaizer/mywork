//code snippet to give access to the hadoop environment through spark context in our programm

val fs = FileSystem.get(sc.hadoopConfiguration)
fs.rename(new Path("<<source>>"), new Path("<<target>>"))
