package Operations


@SerialVersionUID(812)
class Person(val name: String, val age: Int, val salary: Float, val residence: Address,
             @transient val day: String="today", @transient val luckyNumber: Int = 89){
  override def toString: String = {
    s"\nName is ${name} \n age is ${age} \n salary is ${salary} \n residence is ${residence.houseNumber} ${residence.street}  "
  }
}

class Address(val street: String, val houseNumber: Int)

