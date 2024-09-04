

import java.math.BigInteger

class Solution {

    fun fibo(n : Int) : BigInteger {
        var p1 = (0).toBigInteger()
        var p2 = (1).toBigInteger()
        var result = (1).toBigInteger()

        repeat(n - 2){
            p1 = p2
            p2 = result
            result = p1 + p2
        }
        return result
    }

    fun solution(n: Int): Int {

        return (fibo(n) % (1234567).toBigInteger()).toInt()
    }
}