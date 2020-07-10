fun main() {
    /*
    *　・null 安全性（ Null Safety）
    *　・null 許容性（ Nullable ）
    *　・null 非許容性（ Non-null）
    * */

    // Stringはnullを許容できない
    // var str: String = null
    // Stringの後ろに「?」を付けるとエラーにならない
    var str: String? = null
    var str2: String? = "aaa"

    // 変数の後ろに「?」を付けるとエラーにならない
    //println(str2.length)
    println(str2?.length)

    var str3: String? = null
    // 返り値が「null」
    println(str3?.length)
    // 返り値が「0」
    println(str3?:"".length)

    // !!
    var list: MutableList<Int> = mutableListOf(10, 20, 30)
    var num: Int? = list.min()

    // numはIntのnullの許容型なのでエラーになる
    //println(num * 2)
    // スマートキャスト
    if(num != null){
        println(num * 2)
    }

    // !!
    var num2: Int = num!!
    println(num2 * 2)
}