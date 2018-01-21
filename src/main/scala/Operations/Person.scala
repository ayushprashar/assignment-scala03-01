package Operations


@SerialVersionUID(812)
class Person(val name: String, val age: Int, val salary: Float, val residence: Address,
             @transient val day: String, @transient val luckyNumber: Int)

class Address(val street: String, val houseNumber: Int)

