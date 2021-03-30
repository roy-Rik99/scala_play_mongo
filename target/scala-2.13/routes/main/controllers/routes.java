// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rik19/Desktop/L2/Module3/module3/xs-hr-management/conf/routes
// @DATE:Sat Mar 27 02:47:55 IST 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAppController AppController = new controllers.ReverseAppController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAppController AppController = new controllers.javascript.ReverseAppController(RoutesPrefix.byNamePrefix());
  }

}
