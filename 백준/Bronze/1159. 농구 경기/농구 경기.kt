fun main(){
    val abcString = "abcdefghijklmnopqrstuvwxyz"
    var map = mutableMapOf<Char, Int>().apply {
        for (i in abcString) {
            put(i, 0)
        }
    }

    val N = readln().toInt()    // 선수의 수
    repeat(N){
        val name = readln()
        map[name[0]] = map[name[0]]!! + 1
    }

    val resultMap = map.filterValues { it >= 5 }
    if(resultMap.isEmpty()){
        print("PREDAJA")
    }else{
        resultMap.forEach{(key, _ ) ->
            print(key)
        }
    }

}