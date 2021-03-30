package controllers

import javax.inject._
import scala.concurrent.{ExecutionContext, Future}
import play.api._
import play.api.mvc._
import play.api.libs.json._
import reactivemongo.bson.BSONObjectID
import models.EmployeeRecords
import repositories.EmployeeRecordsRepository


@Singleton
class AppController @Inject()(
  implicit ec: ExecutionContext,
  cc: ControllerComponents,
  EmployeeRepo: EmployeeRecordsRepository  
) extends AbstractController(cc) {

  def index() = Action { 
    implicit request: Request[AnyContent] => Ok("App works!")
  }

  def listEmployees() = Action.async {
    EmployeeRepo.list().map {
      records =>  Ok(Json.toJson(records))
    }
  }

  def createEmployee() = Action.async(parse.json) {
    _.body
      .validate[EmployeeRecords]
      .map { record =>  EmployeeRepo.create(record).map { _ =>  Created("New Employee Added!") }
      }
      .getOrElse(Future.successful(BadRequest("Invalid Data!")))
  }

  def getEmployee(uname: String) = Action.async {
    EmployeeRepo.read(uname).map { getRecord =>
      getRecord.map { record  => Ok(Json.toJson(record))
      }
      .getOrElse(NotFound("Employee Not Found!"))
    }
  }

  def updateEmployee(uname: String) = Action.async(parse.json) {
    _.body
      .validate[EmployeeRecords]
      .map {
        record  => EmployeeRepo.update(uname, record).map {
          case Some(record) => Ok(Json.toJson(record))
          case _ => NotFound("Employee Not Found!")
        }
      }
      .getOrElse(Future.successful(BadRequest("Bad Data!")))
  }

  def removeEmployee(uname: String) = Action.async {
    EmployeeRepo.delete(uname).map {
      case Some(record) => Ok("Employee Removed!")
      case _ => NotFound("Employee Not Found!")
    }
  }
}
