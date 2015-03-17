//package api
//
//import java.util.Date
//import Util._
//
//case class FixedIncomeTradeImpl(
//                                 val tradingAccount: Account,
//                                 val instrument: FixedIncome,
//                                 val currency: Currency,
//                                 val tradeDate: Date = TODAY,
//                                 val market: Market,
//                                 val quantity: BigDecimal,
//                                 val unitPrice: BigDecimal) extends FixedIncomeTrade
//
//val t1 = FixedIncomeTradeImpl(
//tradingAccount = NOMURA,
//instrument = IBM,
//currency = USD,
//market = NYSE,
//quantity = 100,
//unitPrice = 42)