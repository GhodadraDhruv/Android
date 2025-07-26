fun main(){


    println("Enter the sentence: ")
    val strList = readln().split('.')

    for(i in 0..<strList.count()){
        if(strList[i].contains(" in ")){
            println(strList[i])
        }
    }
}