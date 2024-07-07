import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

tailrec fun factorial(n: Int, acc: BigInteger = BigInteger.ONE): BigInteger {
    return if (n <= 0) {
        acc
    } else {
        factorial((n - 1), n.toBigInteger() * acc)
    }
}

fun combination(n: Int, r: Int): Long {
    if (r == 0 || r == n) return 1L
    val dp = Array(n + 1) { LongArray(r + 1) }
    for (i in 0..n) {
        for (j in 0..minOf(i, r)) {
            dp[i][j] = if (j == 0 || j == i) 1 else dp[i - 1][j - 1] + dp[i - 1][j]
        }
    }
    return dp[n][r]
}

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val T = br.readLine().toInt()       // 테스트 case 개수

    repeat(T){
        val st = StringTokenizer(br.readLine())
        val N = st.nextToken().toInt()              // 서쪽 사이트 개수
        val M = st.nextToken().toInt()              // 동쪽 사이트 개수

        // m C n

        // val result = factorial(M) / (factorial(M - N) * factorial(N))
        val result = combination(M, N)
        bw.append("$result")
        bw.append("\n")
    }

    bw.flush()
    bw.close()
}