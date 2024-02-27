import wvlet.airframe.surface.Surface

object Main {

  Surface.of[TypeUtils.Wrap] // error: Missing type parameter for Option

  TypeUtils.myMacro() // once this line is commented out, error disappears

  def main(args: Array[String]): Unit = {

  }
}
