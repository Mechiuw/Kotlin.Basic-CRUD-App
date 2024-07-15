package quiz.service

val act = quiz.model.activity
val lis = quiz.model.myList

fun addActivity(){
    print("enter your actions : ")
    val userActions = readlnOrNull()
    print("enter the place of the actions : ")
    val userPlaceActions = readlnOrNull()

    if(userActions != null && userPlaceActions != null){
        act.name = userActions
        act.place = userPlaceActions
        lis.activities[act.name] = act.place
        println(act.formatted())
    } else {
        println("Can't be null")
        addActivity()
    }
}