package quiz.model

object MyList {
    val activities : MutableMap<String,String> = mutableMapOf()
    fun formatted(): String{
        val formattedActivites = StringBuilder("\n")
        activities.forEach {(k,v) ->
            formattedActivites.append("$k = $v\n")
        }
        formattedActivites.append("}");

        return formattedActivites.toString();
    }
}