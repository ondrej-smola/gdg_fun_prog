object monads {
      
  val name : Option[String] = Some("  a  ")       //> name  : Option[String] = Some(  a  )
      
  name
  .map { _.trim }
  .map { _.toUpperCase }
  .foreach { println(_) }                         //> A
   
  
  /*
  
  abstract class Option[+T]{
  
  	def flatMap[U](f : T => Option[U]) : Option[U] = this match {
  		case Some(x) => f(x)
  		case None => None
  	}
  
  }
  
  unit ==  Some(x)
  
  */
}