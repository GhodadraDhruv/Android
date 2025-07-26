fun main(){
    print("Enter a String: ")
    val string1 = readln()
    print("Enter a subString from: \"$string1\" ")
    val subString1 = readln()

    val newString = string1.replace(subString1,"#".repeat(subString1.length))

    print("New String: $newString")
}