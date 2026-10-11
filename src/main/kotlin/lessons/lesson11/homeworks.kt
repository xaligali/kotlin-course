package lessons.lesson11.homeworks

// ЗАДАНИЯ 1–10. СИГНАТУРЫ ФУНКЦИЙ
// 1. Не принимает аргументов и не возвращает значения.
fun task1() {
    println("Задание 1")
}

// 2. Принимает два Int и возвращает их сумму.
fun task2(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает String и ничего не возвращает.
fun task3(text: String) {
    println(text)
}

// 4. Принимает список Int и возвращает среднее значение Double.
fun task4(numbers: List<Int>): Double {
    return numbers.average()
}

// 5. Принимает nullable String и возвращает nullable Int.
// Доступна только внутри текущего файла.
private fun task5(text: String?): Int? {
    return text?.length
}

// 6. Не принимает аргументов и возвращает nullable Double.
fun task6(): Double? {
    return null
}

// 7. Принимает nullable список Int и ничего не возвращает.
// Доступна только внутри текущего файла.
private fun task7(numbers: List<Int>?) {
    println(numbers)
}

// 8. Принимает Int и возвращает nullable String.
fun task8(number: Int): String? {
    return number.toString()
}

// 9. Не принимает аргументов и возвращает список nullable String.
fun task9(): List<String?> {
    return listOf("Kotlin", null, "Java")
}

// 10. Принимает nullable String и nullable Int,
// возвращает nullable Boolean.
fun task10(text: String?, number: Int?): Boolean? {
    if (text == null || number == null) {
        return null
    }
    return text.length == number
}


// =====================================
// ЗАДАНИЯ 11–15. РЕАЛИЗАЦИЯ ФУНКЦИЙ
// =====================================

// 11. Умножение числа на 2.
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

// 12. Проверка числа на чётность.
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 13. Вывод чисел от 1 до n.
// Если n меньше 1, завершаем функцию через return.
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }

    for (number in 1..n) {
        println(number)
    }
}

// 14. Поиск первого отрицательного числа.
// Если отрицательных чисел нет, возвращаем null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }

    return null
}

// 15. Вывод строк из списка.
// При встрече null прекращаем выполнение функции.
fun processList(strings: List<String?>) {
    for (text in strings) {
        if (text == null) {
            return
        }

        println(text)
    }
}

// ПРОВЕРКА РАБОТЫ ФУНКЦИЙ
fun main() {
    println("Задание 11:")
    println(multiplyByTwo(5)) // 10

    println("Задание 12:")
    println(isEven(8)) // true
    println(isEven(7)) // false

    println("Задание 13:")
    printNumbersUntil(5)
    // 1
    // 2
    // 3
    // 4
    // 5

    println("Задание 14:")
    println(findFirstNegative(listOf(3, 7, -4, -8))) // -4
    println(findFirstNegative(listOf(1, 2, 3))) // null

    println("Задание 15:")
    processList(listOf("Первая строка", "Вторая строка", null, "Четвёртая строка"))
    // Первая строка
    // Вторая строка
    // Четвёртая строка не выводится

    println("Дополнительные проверки:")
    println(task2(10, 20)) // 30
    println(task4(listOf(10, 20, 30))) // 20.0
    println(task5("Kotlin")) // 6
    println(task5(null)) // null
    println(task9()) // [Kotlin, null, Java]
    println(task10("Hello", 5)) // true
    println(task10(null, 5)) // null
}