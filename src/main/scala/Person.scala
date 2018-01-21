import java.io._
import org.json4s._
import org.json4s.jackson.Serialization.write
@SerialVersionUID(812)
class Person(val name: String, val age: Int, val salary: Float, val residence: Address,
             @transient val day: String, @transient val luckyNumber: Int)

class Address(val street: String,val houseNumber: Int)

object m extends App {
  implicit val formats = DefaultFormats

  val adp1 = new Address("Rashtrapati Bhawan",9)
  val p1 = new Person("Ayush",24,12000.00f,adp1,"dayday",7)
  val temp = write(p1)
  val pw = new PrintWriter(new File("Temp.txt"))
  pw.write(temp)
  pw.close()
}