import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val r1 = sc.nextInt()
    val r2 = sc.nextInt()
    val r3 = sc.nextInt()

    val totalPrize = when {
        r1 == r2 && r2 == r3 -> 10000 + r1 * 1000
        r1 == r2 || r1 == r3 -> 1000 + r1 * 100
        r2 == r3 -> 1000 + r2 * 100
        else -> maxOf(r1, r2, r3) * 100
    }
    println(totalPrize)

    sc.close()
}