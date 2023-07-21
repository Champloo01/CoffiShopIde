fun main() {
    val coffiShopLida = CoffiShopLida(3.9, 4.9, 4.5)
    val coffiShopMinsk = CoffiShopMinsk(4.9, 5.9, 5.5)
    var currentCoffiShop: CoffiShop

    while (true) {
        println("Привет, выберите ваш город:")
        println("1. Минск\n2. Лида\n0. Выход")

        currentCoffiShop = when (readlnOrNull()) {
            "1" -> coffiShopMinsk
            "2" -> coffiShopLida
            else -> break
        }

        println("Выберите ваш кофе:")
        println("1. Латте\n2. Американо\n3. Капучино\n0. Статистика")

        when (readlnOrNull()) {
            "1" -> currentCoffiShop.makeLatte()
            "2" -> currentCoffiShop.makeAmericano()
            "3" -> currentCoffiShop.makeCappuccino()
            "0" -> {
                println("Введите пароль:")
                if (readlnOrNull() == "Murart123"){
                    currentCoffiShop.showStatistics()
                }
            }
        }
    }
}