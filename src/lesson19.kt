fun main() {
    /*
    * ・デフォルト引数 ：引数を渡さなかった場合に自動的に使用される値
    * ・名前付き引数   ：関数呼び出し時に変数名を指定して呼びだす
    * */

    var num : Int = calcSquareArea(10, 20)
    println(num)

    var num2 : Int = calcSquareArea(10)
    println(num2)
}

fun calcSquareArea(heigth: Int, width: Int = 5) = heigth * width