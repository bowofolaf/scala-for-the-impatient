// in the Person class of section 5.1 on page 55,
// provide a primary constructor that turns negative ages to 0

class Person(var age: Int) {
  if (age < 0) age = 0
}