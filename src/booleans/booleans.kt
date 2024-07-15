package booleans

fun run(){
    println("it is ${checkToBeTrue(5,5)}")
    println("it is ${checkToNotBeTrue(5,5)}")
}

fun checkToBeTrue(f:Int,s:Int) :Boolean{
    return f == s
}

fun checkToNotBeTrue(f:Int,s:Int) :Boolean{
    return f != s
}