package quiz.model
object activity {
    var name : String = ""
    var place : String = ""

    fun formatted():String{
        return "{\n activity : $name \n location at : $place \n}"
    }
}
