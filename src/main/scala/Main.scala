object Main {

  class Wrap(val localOpt: TypeUtils.MyOption[Int])

  Surface.func[Wrap]
  Surface.func[TypeUtils.Wrap]

  //Surface.of[Wrap]
  //Surface.of[TypeUtils.Wrap]

  //TypeUtils.myMacro() // once this line is commented out, error disappears

  def main(args: Array[String]): Unit = {

  }
}
