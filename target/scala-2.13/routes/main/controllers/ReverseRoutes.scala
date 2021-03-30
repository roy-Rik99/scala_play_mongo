// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rik19/Desktop/L2/Module3/module3/xs-hr-management/conf/routes
// @DATE:Sat Mar 27 02:47:55 IST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseAppController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def listEmployees(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee")
    }
  
    // @LINE:3
    def createEmployee(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "employee")
    }
  
    // @LINE:4
    def getEmployee(uname:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uname", uname)))
    }
  
    // @LINE:5
    def updateEmployee(uname:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uname", uname)))
    }
  
    // @LINE:6
    def removeEmployee(uname:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uname", uname)))
    }
  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
