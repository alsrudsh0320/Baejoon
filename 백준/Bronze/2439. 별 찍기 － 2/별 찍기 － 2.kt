import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)

    val tempInt : Int =  sc.nextInt()

    for(i in 1..tempInt){
        for(j in tempInt - i downTo 1){
            print(' ')
        }
        for(k in 1..i){
            print('*')
        }
        println()
    }
    sc.close()
}