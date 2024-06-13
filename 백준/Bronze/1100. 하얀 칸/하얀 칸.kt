import java.util.StringTokenizer

fun main(){
    var count = 0
    for(row in 0 .. 7){
        val st = StringTokenizer(readln())

        for((col,item) in st.nextToken().withIndex()){
            if((row + col) % 2 == 0 && item == 'F') count++
        }
    }
    println(count)
}