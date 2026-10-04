package lessons.lesson09

// Функция для задания 10 с массивами
fun findElement(array: Array<String>, searchString: String) {

    for (element in array) {
        if (element.contains(searchString)) {
            println("Найденный элемент: $element")
            return
        }
    }
}

// Функция для задания 7 с Set
fun checkString(set: Set<String>, searchString: String) {

    var found = false
    for (element in set) {

        if (element == searchString) {
            found = true
            break
        }
    }
    println(found)
}

fun main() {

    // Работа с массивами Array
    // 1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // 2. Создайте пустой массив строк размером 10 элементов.
    val emptyStrings = Array(10) { "" }

    // 3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    // Значение каждого элемента = индекс * 2
    val doubles = Array(5) { index ->
        index * 2.0
    }

    // 4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    // Значение каждого элемента = индекс * 3
    val numbersByIndex = Array(5) { index ->
        index * 3
    }

    // 5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val nullableStrings = arrayOfNulls<String>(3)
    nullableStrings[0] = null
    nullableStrings[1] = "Hello"
    nullableStrings[2] = "Kotlin"

    // 6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val originalArray = arrayOf(10, 20, 30, 40, 50)
    val copiedArray = Array(originalArray.size) { 0 }
    for (index in originalArray.indices) {
        copiedArray[index] = originalArray[index]
    }
    println("Скопированный массив:")
    for (number in copiedArray) {
        println(number)
    }

    // 7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val firstArray = arrayOf(10, 20, 30, 40)
    val secondArray = arrayOf(1, 2, 3, 4)
    val subtractionArray = Array(firstArray.size) { 0 }
    for (index in firstArray.indices) {
        subtractionArray[index] = firstArray[index] - secondArray[index]
    }
    println("Результат вычитания:")
    for (number in subtractionArray) {
        println(number)
    }

    // 8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val searchArray = arrayOf(2, 4, 5, 8, 10)
    var index = 0
    var foundIndex = -1
    while (index < searchArray.size) {

        if (searchArray[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println("Индекс элемента 5: $foundIndex")

    // 9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val evenOddArray = arrayOf(1, 2, 3, 4, 5, 6)
    for (number in evenOddArray) {
        if (number % 2 == 0) {
            println("$number - чётное")
        } else {
            println("$number - нечётное")
        }
    }

    // 10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    val wordsArray = arrayOf(
        "Kotlin programming",
        "Java programming",
        "Python language",
        "Kotlin collections"
    )
    findElement(wordsArray, "Kotlin")

    // Работа со списками List
    // 1. Создайте пустой неизменяемый список целых чисел.
    val emptyList: List<Int> = listOf()

    // 2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val stringList: List<String> = listOf(
        "Hello",
        "World",
        "Kotlin"
    )

    // 3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutableNumbers: MutableList<Int> = mutableListOf(
        1, 2, 3, 4, 5
    )

    // 4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    mutableNumbers.add(6)
    mutableNumbers.add(7)
    mutableNumbers.add(8)
    println("Список после добавления:")
    println(mutableNumbers)

    // 5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val mutableStrings: MutableList<String> = mutableListOf(
        "Hello",
        "World",
        "Kotlin"
    )
    mutableStrings.remove("World")
    println("Список после удаления:")
    println(mutableStrings)

    // 6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val listNumbers = listOf(10, 20, 30, 40, 50)
    for (number in listNumbers) {
        println(number)
    }

    // 7. Создайте список строк и получите из него второй элемент, используя его индекс.
    val fruits = listOf(
        "Apple",
        "Banana",
        "Orange"
    )
    println("Второй элемент: ${fruits[1]}")

    // 8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val changeableNumbers = mutableListOf(
        10, 20, 30, 40, 50
    )
    changeableNumbers[2] = 100
    println("Измененный список:")
    println(changeableNumbers)

    // 9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val firstList = listOf(
        "Kotlin",
        "Java"
    )
    val secondList = listOf(
        "Python",
        "C++"
    )
    val combinedList = mutableListOf<String>()
    for (element in firstList) {
        combinedList.add(element)
    }
    for (element in secondList) {
        combinedList.add(element)
    }
    println("Объединенный список:")
    println(combinedList)

    // 10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val numbersList = listOf(15, 3, 27, 8, 42, 10)
    var min = numbersList[0]
    var max = numbersList[0]
    for (number in numbersList) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }
    println("Минимальный элемент: $min")
    println("Максимальный элемент: $max")

    // 11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val allNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenNumbers = mutableListOf<Int>()
    for (number in allNumbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    println("Четные числа:")
    println(evenNumbers)

    // Работа с множествами Set
    // 1. Создайте пустое неизменяемое множество целых чисел.
    val emptyNumbersSet: Set<Int> = emptySet()

    // 2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val numbersSet: Set<Int> = setOf(
        1, 2, 3
    )

    // 3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val languages: MutableSet<String> = mutableSetOf(
        "Kotlin",
        "Java",
        "Scala"
    )

    // 4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    languages.add("Swift")
    languages.add("Go")
    println("Множество после добавления:")
    println(languages)

    // 5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(
        1, 2, 3, 4, 5
    )
    mutableNumbersSet.remove(2)
    println("Множество после удаления:")
    println(mutableNumbersSet)

    // 6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран
    val setNumbers = setOf(
        10, 20, 30, 40
    )
    for (number in setNumbers) {
        println(number)
    }

    // 7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
    // Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
    val languageSet = setOf(
        "Kotlin",
        "Java",
        "Python"
    )
    checkString(languageSet, "Kotlin")
    checkString(languageSet, "C++")

    // 8.Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    val immutableStrings: Set<String> = setOf(
        "Kotlin",
        "Java",
        "Python"
    )
    val stringsList = mutableListOf<String>()
    for (element in immutableStrings) {
        stringsList.add(element)
    }
    println("Список после конвертации:")
    println(stringsList)
}