package models

import play.api.libs.json.{Json, OFormat}
import reactivemongo.bson.BSONObjectID
import reactivemongo.play.json._


case class EmployeeRecords(
    _id: Option[BSONObjectID],
    userName: String,
    fullName: String,
    email: String,
    //address: Option[Map],
    //contactInfo: Array[Double],
    role: String,
    designation: String
)
object EmployeeRecords {
    implicit val format: OFormat[EmployeeRecords] = Json.format[EmployeeRecords]
}