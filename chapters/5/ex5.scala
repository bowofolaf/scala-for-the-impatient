// Make a class Student with read-write JavaBeans properties name(String) and id(Long).

import scala.beans.BeanProperty

class Student{
  @BeanProperty
  var name: String = _
  @BeanProperty
  var id: Long = _
}

//**** What methods are generated (use javap)

// scala> :javap -private Student
// Compiled from "<console>"
// public class Student {
//   private java.lang.String name;
//   private long id;
//   public java.lang.String name();
//   public void name_$eq(java.lang.String);
//   public void setName(java.lang.String);
//   public long id();
//   public void id_$eq(long);
//   public void setId(long);
//   public java.lang.String getName();
//   public long getId();
//   public Student();
// }

//**** Can u call the java beans getters and setters in scala? Should u? 

// scala> val student = new Student
// student: Student = Student@1ccdc7aa

// scala> student.setId(23)

// scala> student.setName("Jordan")

// scala> student.getId
// res6: Long = 23

// scala> student.getName
// res7: String = Jordan

// scala>

// Seems like a matter of preference. They are there for java bean interop but nothing should
// stop them being used in scala
