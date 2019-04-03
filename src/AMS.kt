import java.util.*

fun main(args: Array<String>) {

    //feedTheFish()

    //println("Your fortune is: ${getFortuneCookie(getBirthday())}")
    var fortune = ""

    while (!fortune.contains("Take it easy and enjoy life!")){
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }

}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

private fun getBirthday(): Int {
    return Random().nextInt(31)
}


fun getFortuneCookie(index: Number): String {
    val fortune = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    when(index){
        in 28..31 ->  return fortune[3]
        in 1..7 ->   return fortune[0]
        else ->  return fortune[index.toInt().rem(fortune.size)]
    }
}


fun dayOrNight2(time: Number): String {
    return if (time in 0..11) "Good morning, Kotlin" else (if (time in 12..23) "Good night, Kotlin" else "WTH")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]

}


fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood(day: String): String {
    return when (day) {
        "Sunday" -> "flakes"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Friday" -> "lettuce"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}


fun dayOrNight(time: Number): String {
    when (time) {
        in 0..11 -> return "Good morning, Kotlin"
        in 12..23 -> return "Good night, Kotlin"
        else -> return "WTH"
    }
}


fun dayOfWeek() {
    println("What day is today")
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> print("Sunday")
        2 -> print("Monday")
        3 -> print("Tuesday")
        4 -> print("Wednesday")
        5 -> print("Thursday")
        6 -> print("Friday")
        7 -> print("Saturday")

    }
}