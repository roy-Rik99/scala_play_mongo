// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rik19/Desktop/L2/Module3/module3/xs-hr-management/conf/routes
// @DATE:Sat Mar 27 02:47:55 IST 2021


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
