package lec_2

/**
 * Даны две строки s и t
 * Строка t сгенерирована из строки s посредством перемешивания символов и
 * добавлением еще одного символа в случайное место
 * Нужно вернуть символ, который был добавлен в строку t
 */
fun main() {
    val s = readLine()
    val t = readLine()

    val lettersInS = mutableSetOf<Char>()

    for (l in s!!.toCharArray()){
        lettersInS.add(l)
    }

    for (l in t!!.toCharArray()){
        if(!lettersInS.contains(l)){
            println("\'$l\' is the letter that was added.")
        }
    }
}