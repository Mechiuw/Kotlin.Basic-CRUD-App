package ifelse

fun run(){
    println(ifelse("hey"))
    println(refactoredIfElse(false))
    println(ternaries(true))

    val arx = arrayOf("A","O","X","Y","C")
    println(findVariable(arx))
    println("indicated Z? = ${indicator(arx)}")
}


//when is for switch case alt
//if(a) b else c is for ternary alt

fun ifelse(v:Any?):String{
        if (v != null) {
            if (v is String) {
                return "it is strings DT"
            } else if (v is Int) {
                return "it is integer DT"
            } else if (v is Boolean) {
                return "It is booleans DT"
            } else if (v is Float) {
                return "It is float DT"
            } else {
                return "no data type found"
            }
        } else {
            return "value can't be null"
        }
}

fun refactoredIfElse(v:Any?) :String{
    return when(v){
        is String -> "it is string data type"
        is Int -> "it is string data type"
        is Boolean -> "it is string data type"
        is Float -> "it is string data type"
        null -> "value can't be null"
        else -> "no data types found"
    }
}

fun ternaries(v:Boolean):String{
    return if(v) "true" else "false"
}

fun findVariable(x: Array<String>):String {
    val index = x.asSequence().indexOf("X")
    return if( index != -1){
        index.toString();
    } else {
        "not found"
    }
}

fun indicator(x: Array<String>) :Boolean {
    return x.contains("Z")
}

