import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    val w = sc.nextInt()
    val h = sc.nextInt()

    println(minOf(minOf(w - x, x) , minOf(h - y , y)))
    
    sc.close()
}