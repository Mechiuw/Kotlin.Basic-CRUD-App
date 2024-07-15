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
        print("ADDED = ")
        println(act.formatted())
        print("LIST = ")
        println(lis.activities.toString())
        doAgain()
    } else {
        println("Can't be null")
        doAgain()
    }
}

fun doAgain(){
    println("try again?")
    val ask = readlnOrNull();
    when(ask){
        "no" -> System.exit(0)
        "yes" -> addActivity()
        null -> println("wrong input")
    }
}