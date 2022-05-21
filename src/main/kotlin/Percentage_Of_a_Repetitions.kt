import kotlin.math.roundToLong

fun percentageOf_a_Repetitions(listOfStrings:MutableList<String>):Double
{
    if(listOfStrings is kotlin.collections.MutableList<String>)
    {
        if(listOfStrings.isEmpty())  return  -1.0
        var c: Int = 0
        for (i in listOfStrings) {
            if (i.length != 1 || (i !in "a".."b")) {
                c++
                break
            }
        }
        return if(c == 0) {
            ((listOfStrings.count { it == "a"  }.div(listOfStrings.size.toDouble())*100)*100.0).roundToLong()/100.0
        } else
            -1.0
    }
    else
        return -1.0

}
fun main() {
    var listOfStrings = mutableListOf<String>("a", "b", "b")
    println(percentageOf_a_Repetitions(listOfStrings))
}