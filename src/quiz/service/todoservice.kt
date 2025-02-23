package quiz.service

import quiz.model.activity
import quiz.model.MyList

val act = activity
val lis = MyList

fun menu(){
    println("1.add")
    println("2.update")
    println("3.delete")
    println("4.get all")
    println("5.get by name")
    println("which one ?")
    val userChoice = readlnOrNull()
    when(userChoice){
        "1" -> addActivity()
        "2" -> update()
        "3" -> delete()
        "4" -> getAllActivities()
        "5" -> getByName()
    }
}

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
        doAgain()
    } else {
        println("Can't be null")
        doAgain()
    }
}

fun getAllActivities(){
    println("ALL ACTIVITIES : ")
    println(lis.formatted())
    doAgain()
}

fun update(){
    print("insert the name you want to update =")
    val userUpdate = readlnOrNull().orEmpty()
    print("insert new activity= ")
    val updatedActivity = readlnOrNull().orEmpty()
    print("insert new location= ")
    val updatedLocation = readlnOrNull().orEmpty()

    var indicate = false;
    lis.activities.forEach{(k) -> if(k == userUpdate){
        lis.activities.remove(k)
        act.name = updatedActivity
        act.place = updatedLocation
        lis.activities[act.name] = act.place
        indicate = true
        } else {
            println("not found any valid key - updating failed to execute")
        }
    }

    if(indicate){
        println("MESSAGE = Activity '$userUpdate' updated to '$updatedActivity' at '$updatedLocation'.")
    } else {
        println("not found any activities")
    }
    getAllActivities()
    doAgain()
}

fun delete(){
    print("insert the name you want to delete =")
    val userUpdate = readlnOrNull()
    lis.activities.forEach{(k) ->
        if(k == userUpdate){
            lis.activities.remove(k)
        }
    }
    getAllActivities()
    doAgain()
}

fun getByName(){
    print("insert the name you want to delete =")
    val userUpdate = readlnOrNull()
    lis.activities.forEach{(k,v) ->
        if(k == userUpdate){
            println("{" +
                    "${k}=${v}" +
                    "}")
        }
    }
    doAgain()
}
fun doAgain(){
    println("try again?")
    val ask = readlnOrNull();
    when(ask){
        "no" -> System.exit(0)
        "yes" -> menu()
        null -> println("wrong input")
    }
}