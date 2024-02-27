import scala.quoted.*

object TypeUtils {
  trait MyOption[T]

  class Wrap(val option: MyOption[Int])

  def macroImpl(using Quotes): Expr[Unit] = '{ }

  inline def myMacro(): Unit = ${ macroImpl }
}
