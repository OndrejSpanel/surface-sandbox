/**
 */
object TypeName {
  def sanitizeTypeName(s: String): String = {
    s.stripSuffix("$").replaceAll("\\.package\\$", ".").replaceAll("\\$+", ".")
  }
}
