import scala.quoted.*

object Surface:

  def funcImpl[A](using tpe: Type[A], quotes: Quotes): Expr[String] = {
    import quotes.*
    import quotes.reflect.*

    val t = TypeRepr.of(using tpe)
    println(s"func ${t.show}")

    val paramStrings = t.typeSymbol.primaryConstructor.paramSymss.flatten
      .map(s => s.tree.show)
    val output =  paramStrings.mkString(",")
    println(s"params $output")
    Expr(output)
  }


  inline def func[A]: String = ${ funcImpl[A] }
