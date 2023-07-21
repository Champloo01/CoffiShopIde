abstract class CoffiShop(val lattePrice: Double, val americanoPrice: Double, val cappuccinoPrice: Double) {
    var latteCount = 0
    var americanoCount = 0
    var cappuccinoCount = 0

    abstract fun makeLatte()
    abstract fun makeAmericano()
    abstract fun makeCappuccino()

    fun showStatistics(){
        println("Купленно Латте: $latteCount")
        println("Купленно Американо: $americanoCount")
        println("Купленно Капучино: $cappuccinoCount")

        var money = latteCount * lattePrice + americanoCount * americanoPrice + cappuccinoCount * cappuccinoPrice
        println("Выручка: $money")
    }

}