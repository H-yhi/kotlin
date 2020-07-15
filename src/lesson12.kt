fun main() {

    /*
    * ・when 多岐分岐
    * */

    val num = 5

    when(num){
        5 -> println("num = 5")
        6, 7 -> println("num = 6 or 7")
        in 11..20 -> println("num = 11~20")
        else -> {
            println("その他")
            println("当てはまりません")
        }
    }

    val num2 = 50

    val str : String = when(num2){
        5 -> "num = 5"
        6, 7 -> "num = 6 or 7"
        in 11..20 -> "num = 11~20"
        else -> {
            println("その他")
            "当てはまりません"
        }
    }
    println(str)
    
    val num3 : Any = 50.0

    when(num3){
        is Int -> println("Int")
        is Double -> println("Double")
        is String -> println("String")
    }
}