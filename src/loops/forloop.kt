package loops

fun run(){
    val arx = arrayOf(1,2,3,4,5)
    forloops(arx)
}

fun forloops(v:Array<Int>) {
    for(x in 0..v.size){
        println(if(x == 4) v.indexOf(4).toString() else "nothing")
    }
}