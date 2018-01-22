package Operations

import java.io._

import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.log4j.Logger
import org.json4s._
import org.json4s.jackson.Json
import org.json4s.jackson.Serialization.write

import scala.io.Source

object MainApp extends App {
  implicit val formats = DefaultFormats
  val log  = Logger.getLogger(this.getClass)
  val houseNumber = 9
  val age = 24
  val salary = 12000f
  val luckyNumber = 7
  val addressPerson1 = new Address("Rashtrapati Bhawan",houseNumber)
  val person1 = new Person("Ayush",age,salary,addressPerson1,"dayday",luckyNumber)
  val writeDetails = write(person1)
  val fileWriter = new PrintWriter(new File("PersonDetails.txt"))
  fileWriter.write(writeDetails)
  fileWriter.close()
  val info = Source.fromFile("PersonDetails.txt").mkString
  val map = Json.apply(formats).read[Person](info.toString)


  log.info(map)

}
