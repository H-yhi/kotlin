fun main() {
    /*
    * ・算術演算子
    * ・比較演算子
    * ・論理演算子
    * ・範囲演算子
    * */

    // 算術演算子 +, -, *, /, %
    var a = 10
    var b = 3
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")
    println()

    // 比較演算子
    var x = 10
    var y = 20
    println(x < y) // x が y より小さい
    println(x <= y) // x が y 以下
    println(x > y) // x が y より大きい
    println(x >= y) // x が y 以上
    println(x == y) // x が y と等しい
    println(x != y) // x が y と等しくない
    println()

    // 論理演算子
    var z = 10
    println(z > 5 && z < 20) // AND（かつ）
    println(z > 5 || z < 20) // OR（または）
    println(!(z > 5)) // NOT（否定）
    println(!true)
    println()

    // 範囲演算子 ..
    // in 演算子：対象が含まれるか
    var n1 = 10
    var n2 = 20
    var array : Array<Int> = arrayOf(n1, n2)
    println(15 in n1..n2)
    println(15 !in n1..n2)
    println(5 in array)
    println("B" in "ABC")
}