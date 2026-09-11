package lessons.lesson04


val myInt: Int = 5
val myFloat: Float = 0.58F
val myLong: Long = 1_234_567_890L
val myShort: Short = 32000
val myByte: Byte = 120
val myDouble: Double = 5.99

val isKotlinFun: Boolean = true
val letter: Char = 'A'
val text: String = "Hello, Kotlin!"

val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: List<String> = listOf("one", "two", "one")
val doubles: Set<Double> = setOf(23.3, 56.8)

val keysToValues: Map<String, String> = mapOf(
    "Ключ 1" to "Значение 1",
    "Ключ 2" to "Значение 2",
)

val name: String? = null

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

var something: Any = "24"
fun change() {
    something = 24
    something = true
    something = ArrayList<String>()
}
//----------
val intParam: Int = 100;
val longParam: Long = 156L;
val floatParam: Float = 12.34f;
val doubleParam: Double = 123.456;
val textParam: String = "Hello, World!";
val booleanParam: Boolean = true;
val chatParam: Char = 'a';

val numbers2: Array<String> = arrayOf("Hello", "world");
val StringParam = "true";
val keysToValues2:  Map<Int, String> = mapOf(12 to "Kotlin");
val floatParam2: Float = 0.1f;
val chatParam2: Char = '!';