fun main(){
    val test_case_num = readln().toInt()
    val sb = StringBuilder()

    repeat(test_case_num){
        var total_score = 0
        var current_score = 0
        val OXString = readln()

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
        sb.append(total_score)
        sb.append('\n')
    }
    print(sb)
}