// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rik19/Desktop/L2/Module3/module3/xs-hr-management/conf/routes
// @DATE:Sat Mar 27 02:47:55 IST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseAppController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def listEmployees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppController.listEmployees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee"})
        }
      """
    )
  
    // @LINE:3
    def createEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppController.createEmployee",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee"})
        }
      """
    )
  
    // @LINE:4
    def getEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppController.getEmployee",
      """
        function(uname0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uname", uname0))})
        }
      """
    )
  
    // @LINE:5
    def updateEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppController.updateEmployee",
      """
        function(uname0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uname", uname0))})
        }
      """
    )
  
    // @LINE:6
    def removeEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppController.removeEmployee",
      """
        function(uname0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uname", uname0))})
        }
      """
    )
  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AppController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
