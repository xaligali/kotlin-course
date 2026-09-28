package lessons.lesson07.highlevel

fun main() {
    // 1. Таблица умножения
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j}\t")
        }
        println()
    }

    // 2. Сумма чисел от 1 до arg
    fun sum(arg: Int): Int {
        var result = 0

        for (i in 1..arg) {
            result += i
        }

        return result
    }

    // 3. Факториал числа arg
    fun factorial(arg: Int): Int {
        var result = 1
        var counter = 1

        while (counter <= arg) {
            result *= counter
            counter++
        }

        return result
    }

    // 4. Сумма четных чисел от 2 до arg
    fun sumEven(arg: Int): Int {
        var result = 0
        var counter = 2

        while (counter <= arg) {
            result += counter
            counter += 2
        }

        return result
    }

    // 5. Прямоугольник 5x3 из *
    fun printRectangle() {
        var row = 1

        while (row <= 3) {
            var column = 1

            while (column <= 5) {
                print("*")
                column++
            }

            println()
            row++
        }
    }

    // 6. Суммы четных и нечетных чисел от 1 до arg
    fun sumEvenAndOdd(arg: Int) {
        var evenSum = 0
        var oddSum = 0

        for (i in 1..arg) {
            if (i % 2 == 0) {
                evenSum += i
            } else {
                oddSum += i
            }
        }
        println("Сумма четных: $evenSum")
        println("Сумма нечетных: $oddSum")
    }
}