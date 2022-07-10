import kotlin.math.max

fun main() {
    val commission:Int
    val amount:Int = 500_005 // 5000 руб. 05 коп.

    commission = max(3500, amount * 75 / 10000) // 0.75%

    println("Сумма списания: ${amount/100.0} руб., комиссия ${commission/100.0} руб., получателю придет ${(amount-commission)/100.0} руб.")
}