fun main(){
    print("Enter a string: ")
    val str = readln()

    val temp = (str.split('>'))

    var st = ""

   for(i in 0..temp.count()-1){
       if(i % 2 != 0){
           st += temp[i].replace(temp[i],temp[i].split('<')[0].uppercase())
       }else{
           st += temp[i].split('<')[0]
       }
   }

    println(st)




}