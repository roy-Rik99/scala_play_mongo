// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rik19/Desktop/L2/Module3/module3/xs-hr-management/conf/routes
// @DATE:Sat Mar 27 02:47:55 IST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  AppController_0: controllers.AppController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    AppController_0: controllers.AppController
  ) = this(errorHandler, AppController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AppController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.AppController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.AppController.listEmployees"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.AppController.createEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """uname<[^/]+>""", """controllers.AppController.getEmployee(uname:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """uname<[^/]+>""", """controllers.AppController.updateEmployee(uname:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """uname<[^/]+>""", """controllers.AppController.removeEmployee(uname:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_AppController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_AppController_index0_invoker = createInvoker(
    AppController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_AppController_listEmployees1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_AppController_listEmployees1_invoker = createInvoker(
    AppController_0.listEmployees,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "listEmployees",
      Nil,
      "GET",
      this.prefix + """employee""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_AppController_createEmployee2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_AppController_createEmployee2_invoker = createInvoker(
    AppController_0.createEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "createEmployee",
      Nil,
      "POST",
      this.prefix + """employee""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_AppController_getEmployee3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("uname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppController_getEmployee3_invoker = createInvoker(
    AppController_0.getEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "getEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """employee/""" + "$" + """uname<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_AppController_updateEmployee4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("uname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppController_updateEmployee4_invoker = createInvoker(
    AppController_0.updateEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "updateEmployee",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """employee/""" + "$" + """uname<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_AppController_removeEmployee5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("uname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AppController_removeEmployee5_invoker = createInvoker(
    AppController_0.removeEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AppController",
      "removeEmployee",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """employee/""" + "$" + """uname<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_AppController_index0_route(params@_) =>
      call { 
        controllers_AppController_index0_invoker.call(AppController_0.index)
      }
  
    // @LINE:2
    case controllers_AppController_listEmployees1_route(params@_) =>
      call { 
        controllers_AppController_listEmployees1_invoker.call(AppController_0.listEmployees)
      }
  
    // @LINE:3
    case controllers_AppController_createEmployee2_route(params@_) =>
      call { 
        controllers_AppController_createEmployee2_invoker.call(AppController_0.createEmployee)
      }
  
    // @LINE:4
    case controllers_AppController_getEmployee3_route(params@_) =>
      call(params.fromPath[String]("uname", None)) { (uname) =>
        controllers_AppController_getEmployee3_invoker.call(AppController_0.getEmployee(uname))
      }
  
    // @LINE:5
    case controllers_AppController_updateEmployee4_route(params@_) =>
      call(params.fromPath[String]("uname", None)) { (uname) =>
        controllers_AppController_updateEmployee4_invoker.call(AppController_0.updateEmployee(uname))
      }
  
    // @LINE:6
    case controllers_AppController_removeEmployee5_route(params@_) =>
      call(params.fromPath[String]("uname", None)) { (uname) =>
        controllers_AppController_removeEmployee5_invoker.call(AppController_0.removeEmployee(uname))
      }
  }
}
