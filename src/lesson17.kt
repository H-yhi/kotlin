fun main() {
    /*
    * ・関数     ：プログラムにまとめたもの
    * ・引数     ：関数に渡す値
    * ・戻り値   ：関数を実行したら返ってくる値
    * ・単一式関数：関数が単一式で構成される場合{}が省略できる
    * */

    // 引数なし
    sayMessage()
    // 引数あり
    sayMessage("hello")
    // 引数、戻り値あり
    println(sayMessage2("hello2"))
    // 引数、返り値あり（複数）
    var str : String = unionString("hello", "world")
    println(str)
}

fun sayMessage(){
    println("sayMessage")
}

fun sayMessage(str : String){
    println("Message = $str")
}

fun sayMessage2(str :String) : String{
    return "Message = $str"
}

// 単一関数
fun unionString(str1 : String, str2 : String) = str1 + str2
