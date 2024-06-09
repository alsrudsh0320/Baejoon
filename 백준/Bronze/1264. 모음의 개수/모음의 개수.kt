import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)   // 스캐너 객체 할당
    var lineList : MutableList<String> = mutableListOf()

    while (true){
        val tempString = sc.nextLine()
        lineList.add(tempString)
        if(tempString.compareTo("#") == 0) break
    }
    var countList : MutableList<Int> = mutableListOf()
    var count = 0
    for(line in lineList){
        if(line.compareTo("#") != 0){
            for(i in line.indices){
                if(line[i] == 'a' || line[i] == 'e' || line[i] == 'i' || line[i] == 'o' || line[i] == 'u'||
                    line[i] == 'A'||line[i] == 'E'|| line[i] == 'I'||line[i] == 'O'||line[i] == 'U'){
                    count++
                }
            }
            countList.add(count)
        }
        count = 0
    }
    for(i in countList){
        println(i)
    }
    sc.close()  // 스캐너 종료
}