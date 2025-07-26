fun main(){
    println("1.Addition")
    println("2.Subtraction")
    println("3.Multiplication")
    println("4.Division")

    print("Enter your choice: ")
    val choice = readln().toInt()
    print("Enter two numbers: ")
    val a = readln().toInt()
    val b = readln().toInt()
    val result:String = when(choice){
        1-> "Addition: ${a} + ${b} = ${a+b}"
        2-> "Subtraction: ${a} - ${b} = ${a-b}"
        3-> "Multiplication: ${a} * ${b} = ${a*b}"
        4-> "Division: ${a} / ${b} = ${a/b}"
        else-> "Wrong Choice!!"
    }

    print(result)
}