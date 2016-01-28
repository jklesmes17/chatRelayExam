package models

case class Channel (
  name: String,
  desc: String,
  optId: Option[Int]
) { def id = optId.getOrElse(0) }
