package lec_2

/**
 * На вход дается массив целых чисел matches где matches[i] = [winneri, loseri]
означается, что игрок winneri победил игрока loseri в матче
Нужно вернуть список answer размеров 2 элемента где:
● answer[0] список всех игроков, у которых нет поражений ни в одном из
матчей
● answer[1]список игроков, у которых есть поражение только в одном
матче.
Значения в двух списках должны быть возвращены в возрастающем порядке
Замечание:
● Вы должны учитывать только тех игроков, которые сыграли хотя бы 1
матч
● Нет двух матчей с одинаковым результатом
 */
fun main() {
    val games: List<List<Int>> = arrayListOf(
        arrayListOf(1, 3),
        arrayListOf(2, 3),
        arrayListOf(3, 6),
        arrayListOf(5, 6),
        arrayListOf(5, 7)
    )

    // 2 (index) -> 8 (lost games)

    val countOfLostGames = hashMapOf<Int, Int>()

    for( game in games){
        val winner = game[0] // winner
        val loser = game[1] // loser

        val gamerLostGame = countOfLostGames.get(winner)
        if(gamerLostGame == null){
            countOfLostGames[winner] = 0
        }

        val loserLostGames = countOfLostGames[loser]
        if(loserLostGames != null){
            countOfLostGames[loser] = loserLostGames+1
        }else{
            countOfLostGames[loser] = 1
        }
    }

    val noLosePlayers = mutableListOf<Int>()
    val oneLosePlayers = mutableListOf<Int>()
    val answer: List<List<Int>> = arrayListOf(
        noLosePlayers,
        oneLosePlayers
    )

    for (player in countOfLostGames.keys){
        val lostGames = countOfLostGames[player]

        if(lostGames == 0){
            noLosePlayers.add(player)
        }else if(lostGames == 1){
            oneLosePlayers.add(player)
        }
    }

    println(answer)
}

/**
 * NOTES
 *
 * There is no static keyword in Kotlin. companion object keywords may be used.
 * However, it is better to just write to function outside the class - it will automatically be static.
 * After that, functions from other files can be used. If the file is from another package, the latter
 * should be imported.
 */