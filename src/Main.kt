fun main() {
    println("Введите первую цифру (0-9):")
    val firstInput = readLine()
    val firstDigit = firstInput?.toIntOrNull()

    println("Введите вторую цифру (0-9):")
    val secondInput = readLine()
    val secondDigit = secondInput?.toIntOrNull()

    if (firstDigit == null || secondDigit == null ||
        firstDigit < 0 || firstDigit > 9 ||
        secondDigit < 0 || secondDigit > 9 ||
        firstDigit == secondDigit) {
        println("Ввод некорректен. Цифры должны находиться в диапазоне от 0 до 9 и быть различными")
        return
    }
    var oddNumber: Int? = null
    if (firstDigit % 2 != 0) {
        oddNumber = firstDigit * 10 + secondDigit
    } else if (secondDigit % 2 != 0) {
        oddNumber = secondDigit * 10 + firstDigit
    }
    if (oddNumber != null) {
        println("Созданное нечетное число: $oddNumber")
    } else {
        println("Создать нечетное число невозможно.")
    }
}