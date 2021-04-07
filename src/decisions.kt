fun main(){
   numbers()

   var name=namesArrays("Jane","J","Joseph")
   println(name)

    var peopleAge=robot(9)

   multipleNumberS()

}
fun numbers(){
    for (num in 1..100)
        if (num%2==1){
            println(num)
        }
}
fun namesArrays(name1:String,name2:String,name3:String):Array<String>{
    var name= arrayOf(name1,name2,name3)
    for (n in name)
        if (n.length>5){
        println(n)
    }
        return name
    }

fun robot(age:Int){
    if(age<6) {
        println("serve a glass of milk")
    }
    else if (age<15){
        println("serve a bottle of fanta Orange")
    }
    else {
        println("get a bottle of coca cola")
}}



fun multipleNumberS() {
    for (numbers in 1..100) {

        if (numbers % 3 == 0) {
            println("fizz")
        }
        if (numbers % 5 == 0) {
            println("buzz")
        }
        if (numbers % 3 == 0 && numbers % 5 == 0) {
            println("fizz buzz")
        }
        else{
            println(numbers)
        }

    }
}
