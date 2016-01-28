package models

import org.joda.time.DateTime
import com.github.tototoshi.slick.PostgresJodaSupport._

case class Log (
  idChannel: Int,
  username: String,
  message: String,
  posted: DateTime = DateTime.now,
  optId: Option[Int]
) {
  def id = optId.getOrElse(0)
}
