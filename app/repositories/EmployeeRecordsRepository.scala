package repositories

import java.util.Date
import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.play.json._
import reactivemongo.play.json.collection.JSONCollection
import reactivemongo.bson.{BSONDocument, BSONObjectID}
import reactivemongo.api.{ReadPreference, Cursor}
import reactivemongo.api.commands.WriteResult
import models.EmployeeRecords

class EmployeeRecordsRepository @Inject()(
    implicit ec: ExecutionContext,
    reactiveMongoApi: ReactiveMongoApi
) {
    private def collection: Future[JSONCollection] = reactiveMongoApi.database.map(_.collection("EmployeeRecords"))

    def list(limit: Int = 20): Future[Seq[EmployeeRecords]] = {
        val before = new Date().getTime()
        var list = collection.flatMap(_.find(BSONDocument()).cursor[EmployeeRecords](ReadPreference.primary).collect[Seq](limit, Cursor.FailOnError[Seq[EmployeeRecords]]()))
        val after = new Date().getTime()
        val exec = after-before
        println(s"Execution Time : $exec ms")
        return list
    }

    def create(er: EmployeeRecords): Future[WriteResult] = collection.flatMap(_.insert(er))

    def read(username: String): Future[Option[EmployeeRecords]] = collection.flatMap(_.find(BSONDocument("userName" -> username)).one[EmployeeRecords])

    def update(username: String, er: EmployeeRecords): Future[Option[EmployeeRecords]] = {
        //var before = new Date() 
        collection.flatMap(_.findAndUpdate(BSONDocument("userName" -> username),
                                           BSONDocument(
                                                f"$$set" -> BSONDocument(
                                                        "email"         ->  er.email,
                                                        "role"          ->  er.role,
                                                        "designation"   ->  er.designation)), true).map(_.result[EmployeeRecords]))
        /*var after = new Date()
        val execution_mills = after - before
        println("Execution Time : "+execution_mills)
        return update*/
    }

    def delete(username: String): Future[Option[EmployeeRecords]] = collection.flatMap(_.findAndRemove(BSONDocument("userName" -> username)).map(_.result[EmployeeRecords]))
}