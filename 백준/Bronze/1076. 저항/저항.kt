import kotlin.math.pow

fun main(){
    val colorArray = arrayOf("black", "brown", "red", "orange", "yellow",
                            "green", "blue", "violet", "grey", "white")
    val color1 = readln()
    val color2 = readln()
    val color3 = readln()
    val result = (colorArray.indexOf(color1) * 10 + colorArray.indexOf(color2)) * (10.0.pow(colorArray.indexOf(color3)) ).toLong()
    print(result)
}