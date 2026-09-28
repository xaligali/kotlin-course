package lessons.lesson08.homeworks

fun main() {
    // 1. Преобразование строк
    fun transformPhrase(phrase: String): String {

        if (phrase.contains("невозможно")) {
            return phrase.replace(
                "невозможно",
                "совершенно точно возможно, просто требует времени"
            )
        }

        if (phrase.startsWith("Я не уверен")) {
            return "$phrase, но моя интуиция говорит об обратном"
        }

        if (phrase.contains("катастрофа")) {
            return phrase.replace(
                "катастрофа",
                "интересное событие"
            )
        }

        if (phrase.endsWith("без проблем")) {
            return phrase.replace(
                "без проблем",
                "с парой интересных вызовов на пути"
            )
        }

        if (!phrase.contains(" ")) {
            return "Иногда, $phrase, но не всегда"
        }

        return phrase
    }
    println(transformPhrase("Это невозможно выполнить за один день"))
    println(transformPhrase("Я не уверен в успехе этого проекта"))
    println(transformPhrase("Произошла катастрофа на сервере"))
    println(transformPhrase("Этот код работает без проблем"))
    println(transformPhrase("Удача"))

    // 2. Извлечение даты и времени из строки лога
    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val arrowIndex = log.indexOf("->")
    val dateTime = log.substring(arrowIndex + 3)
    val dateTimeParts = dateTime.split(" ")
    val date = dateTimeParts[0]
    val time = dateTimeParts[1]
    println(date)
    println(time)

    // 3. Маскирование номера кредитной карты
    val cardNumber = "4539 1488 0343 6467"
    val lastFourDigits = cardNumber.substring(cardNumber.length - 4)
    val maskedCard = "**** **** **** $lastFourDigits"
    println(maskedCard)

    // 4. Форматирование email
    val email = "username@example.com"
    val formattedEmail = email
        .replace("@", " [at] ")
        .replace(".", " [dot] ")
    println(formattedEmail)

    // 5. Извлечение имени файла из пути
    val path = "C:/Пользователи/Документы/report.txt"
    val lastSlashIndex = path.lastIndexOf("/")
    val fileName = path.substring(lastSlashIndex + 1)
    println(fileName)

    // 6. Создание аббревиатуры
    val phrase = "Котлин лучший язык программирования"
    val words = phrase.split(" ")
    var abbreviation = ""
    for (word in words) {
        abbreviation += word[0]
    }
    println(abbreviation)
}