object curry {


  def getImageURL(baseURL: String, name: String): String = {
    s"$baseURL/$name"
  }                                               //> getImageURL: (baseURL: String, name: String)String

  val app1Images = getImageURL("http://app1", _: String)
                                                  //> app1Images  : String => String = <function1>
  val app2Images = getImageURL("http://app2", _: String)
                                                  //> app2Images  : String => String = <function1>
  app1Images("kitty.png")                         //> res0: String = http://app1/kitty.png
  app2Images("kitty.png")                         //> res1: String = http://app2/kitty.png
}