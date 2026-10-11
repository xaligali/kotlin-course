package lessons.lesson10

import java.time.LocalDate

fun main() {

    // Задача 1. Создайте пустой неизменяемый словарь,
    // где ключи и значения — целые числа.
    val emptyMap: Map<Int, Int> = mapOf()

    // Задача 2. Словарь с ключами Float и значениями Double.
    val floatDoubleMap: Map<Float, Double> = mapOf(
        1.5f to 10.5,
        2.5f to 20.5,
        3.5f to 30.5
    )

    // Задача 3. Создайте изменяемый словарь:
    // ключи — Int, значения — String.
    val students = mutableMapOf(
        1 to "Анна",
        2 to "Иван",
        3 to "Мария"
    )

    // Задача 4. Добавьте новые пары ключ-значение.
    students[4] = "Пётр"
    students[5] = "Елена"
    println("После добавления: $students")

    // Задача 5. Получите значение по ключу,
    // в том числе по отсутствующему ключу.
    println("Студент с ключом 2: ${students[2]}")
    println("Студент с ключом 10: ${students[10]}")

    // Задача 6. Удалите элемент по ключу.
    students.remove(3)
    println("После удаления: $students")

    // Задача 7. Словарь Double -> Int.
    // Выведите результат деления ключа на значение.
    // Если значение равно нулю, выведите «бесконечность».
    val divisionMap: Map<Double, Int> = mapOf(
        10.0 to 2,
        15.0 to 3,
        20.0 to 0,
        7.5 to 5
    )

    for ((key, value) in divisionMap) {
        if (value == 0) {
            println("$key / $value = бесконечность")
        } else {
            println("$key / $value = ${key / value}")
        }
    }

    // Задача 8. Измените значение существующего ключа.
    students[1] = "Анна Иванова"
    println("После изменения: $students")

    // Задача 9. Создайте два словаря и объедините их в третий
    // с помощью циклов.
    val firstMap = mapOf(
        1 to "Первый",
        2 to "Второй"
    )

    val secondMap = mapOf(
        3 to "Третий",
        4 to "Четвёртый"
    )

    val combinedMap = mutableMapOf<Int, String>()

    for ((key, value) in firstMap) {
        combinedMap[key] = value
    }

    for ((key, value) in secondMap) {
        combinedMap[key] = value
    }

    println("Объединённый словарь: $combinedMap")

    // Задача 10. Строки -> списки целых чисел.
    val numberLists = mutableMapOf<String, List<Int>>()

    numberLists["Чётные"] = listOf(2, 4, 6, 8)
    numberLists["Нечётные"] = listOf(1, 3, 5, 7)
    numberLists["Простые"] = listOf(2, 3, 5, 7)

    println("Словарь списков: $numberLists")

    // Задача 11. Int -> MutableSet<String>.
    // Получите множество по ключу и добавьте новую строку.
    val fruits = mutableMapOf<Int, MutableSet<String>>(
        1 to mutableSetOf("Яблоко", "Груша"),
        2 to mutableSetOf("Банан", "Апельсин")
    )

    val firstFruitSet = fruits[1]

    if (firstFruitSet != null) {
        firstFruitSet.add("Персик")
        println("Множество фруктов: $firstFruitSet")
    }

    // Задача 12. Ключи — пары чисел.
    // Найдите значение, у которого первый или второй
    // элемент пары равен 5.
    val pairMap = mapOf(
        (1 to 2) to "Первая пара",
        (5 to 3) to "Пятёрка на первом месте",
        (4 to 5) to "Пятёрка на втором месте",
        (6 to 7) to "Последняя пара"
    )

    for ((pair, value) in pairMap) {
        if (pair.first == 5 || pair.second == 5) {
            println("Пара $pair: $value")
        }
    }

    // ЗАДАЧИ НА ПОДБОР ОПТИМАЛЬНОГО ТИПА СЛОВАРЯ

    // Задача 13. Библиотека:
    // автор -> список книг.
    val library: Map<String, List<String>> = mapOf(
        "Лев Толстой" to listOf("Война и мир", "Анна Каренина"),
        "Фёдор Достоевский" to listOf("Идиот", "Преступление и наказание"),
        "Александр Пушкин" to listOf("Евгений Онегин", "Капитанская дочка")
    )

    // Задача 14. Справочник растений:
    // тип растения -> список названий.
    val plants: Map<String, List<String>> = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан", "Ромашка"),
        "Деревья" to listOf("Берёза", "Дуб", "Сосна"),
        "Кустарники" to listOf("Сирень", "Смородина")
    )

    // Задача 15. Четвертьфинал:
    // название команды -> список игроков.
    val teams: Map<String, List<String>> = mapOf(
        "Команда А" to listOf("Иван", "Пётр", "Алексей"),
        "Команда Б" to listOf("Мария", "Елена", "Ольга"),
        "Команда В" to listOf("Дмитрий", "Сергей", "Андрей"),
        "Команда Г" to listOf("Анна", "Ирина", "Наталья")
    )

    // Задача 16. Курс лечения:
    // дата -> список принимаемых препаратов.
    val treatment: Map<LocalDate, List<String>> = mapOf(
        LocalDate.of(2026, 10, 11) to listOf("Препарат А", "Препарат Б"),
        LocalDate.of(2026, 10, 12) to listOf("Препарат А"),
        LocalDate.of(2026, 10, 13) to listOf("Препарат В", "Препарат Б")
    )

    // Задача 17. Словарь путешественника:
    // страна -> (город -> список интересных мест).
    val traveler: Map<String, Map<String, List<String>>> = mapOf(
        "Франция" to mapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр"),
            "Лион" to listOf("Старый город", "Базилика Нотр-Дам-де-Фурвьер")
        ),
        "Италия" to mapOf(
            "Рим" to listOf("Колизей", "Фонтан Треви"),
            "Флоренция" to listOf("Галерея Уффици", "Собор Санта-Мария-дель-Фьоре")
        )
    )

    // Примеры получения данных из последних словарей.
    println("Книги Льва Толстого: ${library["Лев Толстой"]}")
    println("Цветы: ${plants["Цветы"]}")
    println("Игроки команды А: ${teams["Команда А"]}")
    println("Препараты на 11 октября: ${treatment[LocalDate.of(2026, 10, 11)]}")
    println("Достопримечательности Рима: ${traveler["Италия"]?.get("Рим")}")
}