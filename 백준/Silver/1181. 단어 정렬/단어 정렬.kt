import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()           // 단어의 개수

    val set = mutableSetOf<String>()
    
    // 입력
    repeat(N){
        set.add(br.readLine())
    }

    val sortedList = set.sorted().sortedBy { s: String ->
        s.length
    }

    sortedList.forEach{
        bw.append("$it").append("\n")
    }
    bw.flush()

    br.close()
    bw.close()
}