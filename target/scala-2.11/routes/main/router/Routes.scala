
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/Development/Projects/chatRelay/conf/routes
// @DATE:Thu Jan 28 18:19:12 PHT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:16
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:16
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """channel/$id<[^/]+>""", """controllers.Application.channelRoom(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout"""),
    ("""POST""", this.prefix, """controllers.Application.loginSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """channel/$id<[^/]+>""", """controllers.Application.postSubmit(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """channel/""", """controllers.Application.channelSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_channelRoom1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("channel/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_channelRoom1_invoker = createInvoker(
    Application_1.channelRoom(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "channelRoom",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """channel/$id<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_logout2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout2_invoker = createInvoker(
    Application_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_loginSubmit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_loginSubmit3_invoker = createInvoker(
    Application_1.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_postSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("channel/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_postSubmit4_invoker = createInvoker(
    Application_1.postSubmit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "postSubmit",
      Seq(classOf[Int]),
      "POST",
      """""",
      this.prefix + """channel/$id<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_channelSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("channel/")))
  )
  private[this] lazy val controllers_Application_channelSubmit5_invoker = createInvoker(
    Application_1.channelSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "channelSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """channel/"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:7
    case controllers_Application_channelRoom1_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_channelRoom1_invoker.call(Application_1.channelRoom(id))
      }
  
    // @LINE:8
    case controllers_Application_logout2_route(params) =>
      call { 
        controllers_Application_logout2_invoker.call(Application_1.logout)
      }
  
    // @LINE:10
    case controllers_Application_loginSubmit3_route(params) =>
      call { 
        controllers_Application_loginSubmit3_invoker.call(Application_1.loginSubmit)
      }
  
    // @LINE:11
    case controllers_Application_postSubmit4_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_postSubmit4_invoker.call(Application_1.postSubmit(id))
      }
  
    // @LINE:12
    case controllers_Application_channelSubmit5_route(params) =>
      call { 
        controllers_Application_channelSubmit5_invoker.call(Application_1.channelSubmit)
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}