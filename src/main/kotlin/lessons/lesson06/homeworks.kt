package lessons.lesson06

// Задание 1: "Определение сезона"
//Напишите функцию, которая на основе номера месяца распечатывает сезон года. Номера месяцев начинаются с единицы.
fun determineSeason(month: Int) {
    if (month !in 1..12) {
        println("Некорректный номер месяца")
        return
    }

    when (month) {
        12, 1, 2 -> println("Зима")
        3, 4, 5 -> println("Весна")
        6, 7, 8 -> println("Лето")
        9, 10, 11 -> println("Осень")
    }
}


// Задание 2: "Расчет возраста питомца"
// Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам,
// после - каждый год равен 4 человеческим годам. Результат распечатай в консоль.
fun calculateDogAge(dogAge: Double) {
    if (dogAge < 0) {
        println("Возраст не может быть отрицательным")
        return
    }

    val humanAge = if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        2 * 10.5 + (dogAge - 2) * 4
    }

    println(humanAge)
}


// Задание 3: "Определение способа перемещения"
// Напишите функцию, которая печатает в консоль, какой способ перемещения лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
fun determineTransport(distance: Double) {
    if (distance < 0) {
        println("Длина маршрута не может быть отрицательной")
        return
    }

    when {
        distance <= 1 -> println("пешком")
        distance <= 5 -> println("велосипед")
        else -> println("автотранспорт")
    }
}


// Задание 4: "Расчет бонусных баллов"
// Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и печатает в консоль количество бонусных баллов:
// 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 3 балла за каждые 100 рублей при сумме свыше этого.
fun calculateBonus(purchaseAmount: Double) {
    if (purchaseAmount < 0) {
        println("Сумма покупки не может быть отрицательной")
        return
    }

    val bonusPoints = if (purchaseAmount <= 1000) {
        (purchaseAmount / 100 * 2).toInt()
    } else {
        (purchaseAmount / 100 * 3).toInt()
    }

    println(bonusPoints)
}


// Задание 5: "Определение типа документа"
// В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла печатает в консоль его тип: "Текстовый документ",
// "Изображение", "Таблица" или "Неизвестный тип".
fun determineDocumentType(extension: String) {
    val normalizedExtension = extension.lowercase().removePrefix(".")

    when (normalizedExtension) {
        "txt", "doc", "docx" -> println("Текстовый документ")
        "jpg", "jpeg", "png" -> println("Изображение")
        "xls", "xlsx", "csv" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}


// Задание 6: "Конвертация температуры"
// Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F).
// Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Распечатай в консоль результат конвертации с добавлением единицы измерения.
// Чтобы добавить единицу измерения после результата используй функцию печати без переноса строки print("C") или print("F").
fun convertTemperature(temperature: Double, unit: Char) {
    when (unit.uppercaseChar()) {
        'C' -> {
            val fahrenheit = temperature * 9 / 5 + 32
            print(fahrenheit)
            print("F")
        }

        'F' -> {
            val celsius = (temperature - 32) * 5 / 9
            print(celsius)
            print("C")
        }

        else -> println("Некорректная единица измерения. Используйте C или F")
    }
}


// Задание 7: "Подбор одежды по погоде"
// Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже +10,
// "ветровка" от +10 до +18 градусов включительно и "футболка и шорты" при температуре выше +18 градусов. При температурах ниже -30
// и выше +35 рекомендуйте не выходить из дома.
fun recommendClothes(temperature: Int) {
    when {
        temperature < -30 || temperature > 35 ->
            println("не выходить из дома")

        temperature < 10 ->
            println("куртка и шапка")

        temperature <= 18 ->
            println("ветровка")

        else ->
            println("футболка и шорты")
    }
}


// Задание 8: "Выбор фильма по возрасту"
// Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и возвращает
// доступные для него категории фильмов: "детские" (от 0 до 9), "подростковые" (от 10 до 18), "18+" для остальных.
fun getMovieCategory(age: Int): String {
    return when {
        age < 0 -> "Некорректный возраст"
        age <= 9 -> "детские"
        age <= 18 -> "подростковые"
        else -> "18+"
    }
}


// Проверка всех заданий
fun main() {

    println("Задание 1:")
    determineSeason(1)
    determineSeason(4)
    determineSeason(7)
    determineSeason(10)
    determineSeason(13)

    println("\nЗадание 2:")
    calculateDogAge(1.9)
    calculateDogAge(2.0)
    calculateDogAge(2.1)
    calculateDogAge(-1.0)

    println("\nЗадание 3:")
    determineTransport(0.5)
    determineTransport(3.0)
    determineTransport(10.0)
    determineTransport(-1.0)

    println("\nЗадание 4:")
    calculateBonus(500.0)
    calculateBonus(1000.0)
    calculateBonus(1500.0)
    calculateBonus(-100.0)

    println("\nЗадание 5:")
    determineDocumentType("txt")
    determineDocumentType(".jpg")
    determineDocumentType("xlsx")
    determineDocumentType("zip")

    println("\nЗадание 6:")
    convertTemperature(25.0, 'C')
    println()
    convertTemperature(77.0, 'F')
    println()
    convertTemperature(25.0, 'X')

    println("\nЗадание 7:")
    recommendClothes(-31)
    recommendClothes(-30)
    recommendClothes(9)
    recommendClothes(10)
    recommendClothes(18)
    recommendClothes(19)
    recommendClothes(35)
    recommendClothes(36)

    println("\nЗадание 8:")
    println(getMovieCategory(5))
    println(getMovieCategory(15))
    println(getMovieCategory(18))
    println(getMovieCategory(25))
    println(getMovieCategory(-1))
}