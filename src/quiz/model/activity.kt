package quiz.model
object activity {
    var name : String = ""
    var place : String = ""

    fun formatted():String{
        return "{ $name, $place }"
    }
}
