/**
 * Note: This interface is the same with scala-2 Surface interface, but Scala compiler requires defining Surface object
 * in the same file, so this interface is copied.
 */
trait Surface extends Serializable:
  def rawType: Class[?]
  def typeArgs: Seq[Surface]
  def params: Seq[Parameter]
  def name: String
  def fullName: String

  def dealias: Surface = this

  def isOption: Boolean
  def isAlias: Boolean
  def isPrimitive: Boolean
  def isSeq: Boolean   = classOf[Seq[_]].isAssignableFrom(rawType)
  def isMap: Boolean   = classOf[Map[_, _]].isAssignableFrom(rawType)
  def isArray: Boolean = this.isInstanceOf[ArraySurface]

  /**
   * True if this surface is a Scala3 enum
   */
  def isEnum: Boolean = classOf[scala.reflect.Enum].isAssignableFrom(rawType)

  def objectFactory: Option[ObjectFactory] = None
  def withOuter(outer: AnyRef): Surface    = this

/**
 * Scala 3 implementation of Surface
 */
object Surface:
  val scalaMajorVersion: Int = 3

  import scala.quoted.*

  inline def of[A]: Surface                   = ${ CompileTimeSurfaceFactory.surfaceOf[A] }

  inline def func[A]: Unit = ${ CompileTimeSurfaceFactory.func[A]}

