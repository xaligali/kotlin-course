package lessons.lesson05

val sum = 10 + 5 // 15
val diff = 10 - 5 // 5
val product = 10 * 5 // 50
val quotient = 10 / 5 // 2
val remainder = 10 % 5 // 0
val remainder1 = 10 % 6 // 4
val remainder2 = 10 % 4 // 2

val isEqual = (5 == 5) // true
val isNotEqual = (5 != 5) // false
val isGreater = (5 > 3) // true
val isLesser = (5 < 3) // false
val isGreaterOrEqual = (5 >= 5) // true
val isLesserOrEqual = (5 <= 3) // false

val andResult = (5 > 3) && (5 > 4) // true
val orResult = (5 > 3) || (5 < 4) // true
val notResult = !(5 > 3) // false

var number = 5
number += 3 // number теперь равно 8
// равнозначное выражение: number = number + 3

var a = 5
var b = a++
println("a: $a")
println("b: $b")

var c = 5
var d = ++c
println("c: $c")
println("d: $d")

val name: String? = null
val result = name ?: "Unknown" // "Unknown", так как name равно null

// Задача: вывести текущий уровень громкости аудиосистемы.
// Известно, что после перезагрузки, пользовательский уровень громкости не назначен.
// Дефолтный уровень громкости равен 30%.
fun main() {
    printVolume(null)
}

fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}
//

var ex1: Boolean = ((8 + 1) >= 9) || (6 - 2 != 4) && (2 * 3 == 6);

//
var ex2: Boolean = (3 + 2 < 6)  && (4 * 2 == 8)

// Ответ
val powerBank = innerAccumulator + (externalAccumulator ?: 0)