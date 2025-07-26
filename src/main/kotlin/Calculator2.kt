fun main(){
    println("1.Addition")
    println("2.Subtraction")
    println("3.Multiplication")
    println("4.Division")

    println("Enter your choice: ")
    val choice = readln().toInt()

    println("Enter two number: ")
    val a = readln().toInt()
    val b = readln().toInt()

    if(choice == 1){
        println("${a} + ${b} = ${a+b}")
    }else if(choice == 2){
        println("${a} - ${b} = ${a-b}")
    }else if(choice == 4){
        println("${a} / ${b} = ${a/b}")
    }else if(choice == 3){
        println("${a} * ${b} = ${a*b}")
    }else{
        println("Wrong Choice!!")
    }
}