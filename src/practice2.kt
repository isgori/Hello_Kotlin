import java.util.*


fun main(args: Array<String>) {
    val mood:String="adad"
    val weather:String="sadadunny"
    val temperatue=24
    println( whatShouldIDoToday(mood,weather, Random().nextInt(45)))

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    //val currys = spices.filter { it.contains("curry")}
    /*print(spices.filter { it.contains("curry")})
    print(spices.filter { it[0] == 'c' && it[it.length-1] == 'e'})
    print(spices.take(3).filter { it[0] == 'c'})*/

    val rollDice= { sides: Int->
        if (sides==0) 0
        else Random().nextInt(sides)+1
    }

}

fun whatShouldIDoToday(mood: String, weather: String, temperatue: Int = 30): String {
    return  when{
        mood.toLowerCase() == "happy" && weather.toLowerCase() =="sunny" ->  "go for a walk"
        mood.toLowerCase() == "sad" && weather.toLowerCase() =="sunny" ->  "watch netflix"
        mood.toLowerCase() == "sad" && weather.toLowerCase() =="windy" ->  "heard sad music"
        temperatue >= 32-> "pinche calor"
        temperatue <= 32-> "pinche fresco"

        else -> "Stay home and read."
    }
}


fun isSoBorgin(name: String ) = name=="crepusculo"
