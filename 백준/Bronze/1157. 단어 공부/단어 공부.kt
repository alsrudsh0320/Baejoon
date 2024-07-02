import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val line = br.readLine().lowercase()
    val array = Array (26) {0}
    
    line.forEach { ch ->
        val index = ch - 'a'
        array[index]++
    }
    val index1 = array.indexOf(array.max())
    val index2 = array.lastIndexOf(array.max())
    if(index1 == index2){
        bw.append("${(index1 + 65).toChar()}")
    }else{
        bw.append("?")
    }

    bw.flush()

}