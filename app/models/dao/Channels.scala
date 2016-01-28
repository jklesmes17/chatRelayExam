package models.dao

import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

import slick.profile.RelationalProfile
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}

import models.Channel

class Channels @Inject() (
  val dbConfigProvider: DatabaseConfigProvider
) extends HasDatabaseConfigProvider[RelationalProfile] {

  import slick.driver.PostgresDriver.api._

  val query = TableQuery[ChannelsTable]

  /** Insert new Channel */
  def insert(channel: Channel): Future[Int] = db.run((query returning query.map(_.id)) += (channel))

  /** Get all Channels */
  def getChannels: Future[Seq[Channel]] = db.run( query.result )

  /** Channel Table Definition */
  class ChannelsTable(tag: Tag) extends Table[Channel](tag, "CHANNELS") {
    def name = column[String]("NAME")
    def desc = column[String]("DESC")
    def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

    def * = (name, desc, id.?) <> (Channel.tupled, Channel.unapply)
  }
}
