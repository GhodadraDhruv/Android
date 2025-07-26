fun main(){
    val list = listOf(1,2,3,"abc","def")
    val list2 = listOf<String>("ABC","BBC","CBC")

//    for(i in list2){
//        println(i)
//    }

    println(list2[0])

//    list.add(12)

    val mutableList = mutableListOf<Int>(1,2,3)

    mutableList.add(12)

    println(mutableList)
}