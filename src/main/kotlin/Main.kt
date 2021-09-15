fun main() {
    val totalAmount = 10000
    val price = 2000
    val meloman = true
    var sum = 0
    if (1001 <= totalAmount && totalAmount <= 10000 ) {
        sum = price - 100
        if (meloman){
            val  totalSum = if (meloman) sum * 99/100 else sum
            println("После применения скидки 100 рублей $sum")
            println("После применения скидки 1% рублей $totalSum")
        } else {
            println("После применения скидки 100 рублей $sum")
        }
    } else if(totalAmount > 1000100){
        if (meloman){
            sum = price * 95 /100
            val totalSum = sum * 99/100
            println("После применения скидки 5%  $sum")
            println("После применения скидки 1%  $totalSum")
        } else {
            println("После применения скидки 5% $sum")
        }

    } else{
        if (meloman){
            sum = price
            val totalSum = sum * 99/100
            println("Сумма без скидки $sum")
            println("Сумма после применения скидки $totalSum")

        } else {
            sum = price
            sum = price
            println("Сумма без скидки $sum")
        }

    }
}