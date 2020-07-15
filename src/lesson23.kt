fun main() {
    /*
    * ・ラムダ式（匿名関数）
    * ・無名関数
    * */

    // ラムダ式
    println(calcC(5, 10){ x: Int, y: Int -> x + y})

    // 無名関数
    var num : Int = calcC(5, 10, fun(x: Int, y: Int): Int = x + y)
}

fun calcC(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)