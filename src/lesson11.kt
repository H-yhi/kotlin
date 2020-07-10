fun main() {
    /*
    * ・if 分岐条件
    * */

    var num = 120

    if(num > 100){
        println("num > 100")
    } else if(num > 50){
        println("num > 50")
    } else {
        println("その他")
    }

    var num2 = 60
    val str : String = if(num2 > 100){
        "num > 100"
    } else if(num2 > 50){
        "num > 50"
    } else {
        "その他"
    }
    println(str)
}