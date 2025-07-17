fun main(){
    val ls = mutableListOf<Int>()

    println("how many value do you want to enter: ")

    val no = readln().toInt()

    for(i in 1..no){
        print("Enter $i value: ")
        ls.add(readln().toInt())
    }

    val average= ls.sum()/ls.count()

    println("Average: $average")

}