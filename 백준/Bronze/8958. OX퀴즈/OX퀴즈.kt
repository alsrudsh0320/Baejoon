import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val test_case_num = br.readLine().toInt()

    repeat(test_case_num){
        var total_score = 0
        var current_score = 0
        val OXString = br.readLine()

        OXString.forEach { ch ->
            when(ch){
                'O' -> {
                    current_score++
                    total_score += current_score
                }
                'X' -> {
                    current_score = 0
                }
            }
        }
        bw.append("$total_score\n")
    }
    bw.flush()
    bw.close()
}