import java.util.Scanner
data class Profile(
    var name : String,
    var age : Int,
    var weight : Int
)
fun ageCheck(age : Int) : Boolean{
    return age > 17
}
fun weightCheck(weight : Int) : Boolean{
    return weight >= 80
}
fun main(){
    var sc = Scanner(System.`in`)
    var profileList : MutableList<Profile> = mutableListOf()

    loop@
    while (true){
        var name = sc.next()
        var age = sc.nextInt()
        var weight = sc.nextInt()
        if(name.compareTo("#") != 0 ){
            profileList.add(Profile(name = name, age = age, weight = weight))
        }
        if(name.compareTo("#") == 0 && age == 0 && weight == 0){
            break@loop
        }
    }

    val result : List<Pair<String,String>> = profileList.map { profile ->
        var profileString : String = "Junior"
        if (ageCheck(profile.age) || weightCheck(profile.weight)){
            profileString = "Senior"
        }
        Pair(profile.name, profileString)
    }

    for(i in result){
        println(i.first + " " + i.second)
    }


}