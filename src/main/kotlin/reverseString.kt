fun main(){

    val sampleString = readln()

    val words =  sampleString.split(' ')

    for(i in words.reversed()){
        print("$i ")
    }

}