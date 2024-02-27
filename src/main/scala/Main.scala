object Main {

  class LocalWrap(val localOpt: TypeUtils.MyOption[Int])

  println(Surface.func[LocalWrap])
  println(Surface.func[TypeUtils.Wrap])

  //TypeUtils.myMacro() // once this line is commented out, error disappears

  def main(args: Array[String]): Unit = {

  }
}
