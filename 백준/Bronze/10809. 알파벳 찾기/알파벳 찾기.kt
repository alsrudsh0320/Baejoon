fun main(){
    val sb = StringBuilder()
    val abcString = "abcdefghijklmnopqrstuvwxyz"

    val S = readln()

    for(ch in abcString){
        sb.append(S.indexOf(ch))
        sb.append(" ")
    }
    print(sb)
}