fun main() {
    val school = "akirachix"
    println(school[0] + "" +school[2] + school[3])

    printname("Ann",20)
    getlength("My name is Ann")
    call("bro")
}
fun printname(name:String,age:Int):String{
    val sentence = "Hi,my name is $name and I am $age years old"
    return sentence

}

fun getlength(length1:String):Int{
    val length = length1.length
    return length
}
fun call(text:String){
    val b = "bro"
    if (text.equals(b))
    {
        println("That's me")
}
    else{
    println("I don't know who that is")
    }
}




