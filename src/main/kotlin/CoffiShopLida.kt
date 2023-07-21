class CoffiShopLida(lattePrice: Double, americanoPrice: Double, cappuccinoPrice: Double) :
    CoffiShop(lattePrice, americanoPrice, cappuccinoPrice) {

    override fun makeLatte() {
        latteCount++
        println("Спасио за заказ Латте в Лиде!")
    }

    override fun makeAmericano() {
        americanoCount++
        println("Спасибо за заказ Американо в Лиде!")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Спасибо за заказ Капучино в Лиде!")
    }
}