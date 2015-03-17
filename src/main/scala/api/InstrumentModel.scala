//package api
//
///**
// * Created by andryw on 16/03/15.
// */
//import java.util.Date
//import Util._
//sealed abstract class Currency(code: String)
//
//case object USD   extends Currency("US Dollar")
//
//case object JPY extends Currency("Japanese Yen")
//
//case object HKD extends Currency("Hong Kong Dollar")
//
//trait Instrument {
//  val isin: String
//}
//case class Equity(isin: String, dateOfIssue: Date = TODAY)
//  extends Instrument
//
//trait FixedIncome extends Instrument {
//  def dateOfIssue: Date
//
//  def dateOfMaturity: Date
//
//  def nominal: BigDecimal
//}
//
//case class CouponBond(
//                       override val isin: String,
//                       override val dateOfIssue: Date = TODAY,
//                       override val dateOfMaturity: Date,
//                       val nominal: BigDecimal,
//                       val paymentSchedule: Map[String, BigDecimal])
//  extends FixedIncome
//
//case class DiscountBond(
//                         override val isin: String,
//                         override val dateOfIssue: Date = TODAY,
//                         override val dateOfMaturity: Date,
//                         val nominal: BigDecimal,
//                         val percent: BigDecimal)
//  extends FixedIncome