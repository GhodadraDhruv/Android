fun main(){
    val no1 = readln().toInt()
    val no2 = readln().toInt()
    var count = 0

    for(i in no1..no2){
        if(i % 5 == 0){
            count++;
        }
    }
    print("Count:$count")
}