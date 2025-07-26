fun main(){
    delete("Student","id",2)
    insert("Student", mapOf<String,Any>("name" to "ABC","city" to "RAJKOT") )
}

fun insert(tableName: String,map:Map<String,Any>){

    val columnNameList = map.keys.toString().replace('[',' ').replace(']',' ')
    val columnValueList = map.values.toString().replace('[',' ').replace(']',' ')


    val query = "INSERT INTO $tableName($columnNameList) VALUES($columnValueList)"

    println(query)

}

fun delete(tableName:String,columnName:String,columnValue:Any){

    val query = "DELETE FROM $tableName WHERE $columnName = $columnValue"

    println(query)

}