fun main(){
    var maxPeople = 0
    var currentPeople = 0
    repeat(4){
        val (x, y) = readln().split(" ").map { it.toInt() }
        currentPeople -= x
        currentPeople += y
        if(currentPeople > maxPeople) maxPeople = currentPeople
    }
    println(maxPeople)
}