object case_class2 {

  abstract class Person {
    def name: String
  }

  case class Male(name: String) extends Person
  case class Female(name: String) extends Person

  def isFemale(p: Person) = {
    p match {
      case Male(name) => false
      case Female(name) => true
    }
  }                                               //> isFemale: (p: case_class2.Person)Boolean

  isFemale(Female("Paja"))                        //> res0: Boolean = true
  isFemale(Male("Ondra"))                         //> res1: Boolean = false

  def findAndConvertToPerson(name: String, toPerson: String => Person) = {
    if (name.nonEmpty)
      Some(toPerson(name))
    else
      None
  }                                               //> findAndConvertToPerson: (name: String, toPerson: String => case_class2.Perso
                                                  //| n)Option[case_class2.Person]

  for (
    husband <- findAndConvertToPerson("Pepa", Male(_));
    wife <- findAndConvertToPerson("Jana", Female(_))
  ) println(s" ${husband.name} +++ ${wife.name} ")//>  Pepa +++ Jana 

}