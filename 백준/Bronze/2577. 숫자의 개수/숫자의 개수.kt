fun main(){
    var cal_result = 1
    repeat(3){
        cal_result *= readln().toInt()
    }
    val s_cal_result = cal_result.toString()
    for(i in 0 .. 9){
        println(s_cal_result.count { it in "$i" })
    }
}