import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val count = sc.nextInt()
    var list = mutableListOf<Int>()

    for(i in 1 .. count){
        list.add(sc.nextInt())
    }
    val Y = list.map{ pay ->
        (pay / 30) * 10 + 10
    }
    val M = list.map{ pay ->
        (pay / 60) * 15 + 15
    }
    val ySum = Y.sum()
    val mSum = M.sum()

    if(ySum == mSum) {
        println("Y M ${ySum}")
    }else if(ySum < mSum){
        println("Y $ySum")
    }else{
        println("M $mSum")
    }
    sc.close()
}