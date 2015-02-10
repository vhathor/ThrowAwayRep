package sparkG.sparkA


import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

/**
 * Hello world!
 *
 */
object App {
  
  def  main(args: Array[String])  {
    val logFile = "vdhs/data.1" // Should be some file on your system
    val conf = new SparkConf().setAppName("App")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.count()
    println("Lines with a: %s".format(numAs))
  }
}

