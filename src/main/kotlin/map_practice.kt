fun main(){
    val map = mapOf("name" to "abc","city" to "rajkot","roll" to 1)

    println(map.keys)
    println(map.values)

//    map.put("rank","1")

    val mutableMap = mutableMapOf("name" to "abc","city" to "rajkot","roll" to 2)

    println(mutableMap.keys)
    println(mutableMap.values)

    mutableMap.put("rank",1)
    mutableMap["name"] = "bbc"

    println(mutableMap)

}