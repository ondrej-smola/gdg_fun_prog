object pattern_match {

  class SmartInt(val i: Int) {
    def isZero = i == 0
  }

  implicit def useSmartInts(i : Int) = new SmartInt(i)
                                                  //> useSmartInts: (i: Int)pattern_match.SmartInt

  def isSumOfFirstTwoElementsZero(lst: List[Int]) = {
    lst match {
      case first :: second :: _ if first + second isZero => true
      case _ => false
    }
  }                                               //> isSumOfFirstTwoElementsZero: (lst: List[Int])Boolean

  isSumOfFirstTwoElementsZero(List())             //> res0: Boolean = false
  isSumOfFirstTwoElementsZero(List(2))            //> res1: Boolean = false
  isSumOfFirstTwoElementsZero(List(3, -3, 2))     //> res2: Boolean = true
  isSumOfFirstTwoElementsZero(1 to 5 toList)      //> res3: Boolean = false
}