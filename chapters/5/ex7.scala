// write a class person with a constructor that accepts a first name, space then last name. 
// Supply read only properties firstName and lastName. 

class Person(name: String) {
  val Array(firstName, lastName) = name.split(" ")
}

//**** Should the primary constructor be a var, val or a plain parameter. why?

// ans: plain parameter, it doesnt need to accessed after construction

// scala> val person = new Person("toye fado")
// person: Person = Person@1c5cd2ea

// scala> person.firstName
// res9: String = toye

// scala> person.lastName
// res10: String = fado

// scala> person.name
// <console>:16: error: value name is not a member of Person
//        person.name
//               ^