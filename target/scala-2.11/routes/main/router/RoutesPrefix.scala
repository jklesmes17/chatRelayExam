
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/chatRelay/conf/routes
// @DATE:Thu Jan 28 18:19:12 PHT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
