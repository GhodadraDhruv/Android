fun main(){
    print("Enter a string: ")
    val str = readln()

    if(str == str.reversed()){
        println("\"${str}\" is a palindrome string")
    }else {
        println("\"${str}\" is not a palindrome string")
    }
}