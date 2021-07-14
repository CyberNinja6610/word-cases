import kotlin.math.min
val wordForm = arrayOf("человеку", "людям", "людям");

fun main() {
    try {
        println("Введите количество");
        val likes = readLine()!!.toInt();
        if (likes < 0) {
            throw Exception("Must be greater then 0")
        }
        val word = getPluralForm(likes, wordForm);
        println("Понравилось $likes $word");
    } catch (e: Exception) {
        println("Введено некоректное значение");
    }
}

fun getPluralForm(count: Int, words: Array<String>): String {
    val cases = intArrayOf(2, 0, 1, 1, 1, 2);
    val word = words[if (count%100 in 5..19) 2 else cases[min(count%10, 5)]];

    return word;
}