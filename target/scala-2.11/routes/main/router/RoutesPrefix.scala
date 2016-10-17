
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/New folder/Word-Scramble-Game/conf/routes
// @DATE:Mon Oct 17 23:38:30 ICT 2016


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
