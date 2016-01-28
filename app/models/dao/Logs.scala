package models.dao

import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

import slick.profile.RelationalProfile
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import org.joda.time.DateTime
import com.github.tototoshi.slick.PostgresJodaSupport._

import models.Log


class Logs @Inject() (
  val dbConfigProvider: DatabaseConfigProvider,
  val channels: Channels
) extends HasDatabaseConfigProvider[RelationalProfile] {

  import slick.driver.PostgresDriver.api._

  val query = TableQuery[LogsTable]


  /** Insert new Log */
  def insert(data: Log): Future[Boolean] = db.run((query += (data)).map(_ > 0))

  /** Retrieve Logs by Channel Id */
  def getById(idChannel: Int): Future[Seq[Log]] = db.run {
    query.filter(_.idChannel === idChannel).result
  }

  /** Logs Table Definition */
  class LogsTable(tag: Tag) extends Table[Log](tag, "LOGS") {
    def idChannel = column[Int]("IDCHANNEL")
    def username = column[String]("USERNAME")
    def message = column[String]("MESSAGE")
    def posted = column[DateTime]("POSTED")
    def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

    def * = (idChannel, username, message, posted, id.?) <> (Log.tupled, Log.unapply)

    def log = foreignKey("FK_ID_CHANNEL" + tableName, idChannel, channels.query)(_.id, onUpdate=ForeignKeyAction.Cascade, onDelete=ForeignKeyAction.Cascade)
  }
}
