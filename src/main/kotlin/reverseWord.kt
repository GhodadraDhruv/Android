fun main(){
    val sampleString = readln()

    println(sampleString.reversed())
    for(i in sampleString.length - 1 downTo 0){
        print(sampleString[i])
    }
}