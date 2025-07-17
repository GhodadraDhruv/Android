fun main(){
    println("Enter a String: ")
    val string1 = readln()
    println("Enter a subString from \"$string1\": ")
    val subString1 = readln()

    val newString = string1.replace(subString1,"#".repeat(subString1.length))

    println("New String: $newString")
}