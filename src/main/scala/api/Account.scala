//package api
//
///**
// * Created by andryw on 16/03/15.
// */
//abstract class AccountType(name: String)
//case object CLIENT extends AccountType("Client")
//case object BROKER extends AccountType("Broker")
//import Util._
//import java.util.Date
//abstract class Account(no: String, name: String, openDate: Date) {
//  val accountType: AccountType
//  private var closeDate: Date = _
//  var creditLimit: BigDecimal = 100000
//  def close(date: Date) = {
//    closeDate = date
//  }
//}
//case class ClientAccount(no: String, name: String,
//                         openDate: Date = TODAY)
//  extends Account(no, name, openDate) {
//  val accountType = CLIENT
//}
//
//case class BrokerAccount(no: String, name: String,
//                         openDate: Date = TODAY)
//  extends Account(no, name, openDate) {
//  val accountType = BROKER
//}
//
