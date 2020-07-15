fun main() {
    /*
    * ・高階関数：引数や戻り値に関数を指定する
    * ・ラムダ式（匿名関数）：使い捨ての関数
    * */

    var func = ::calcA
    println(func(10,5))

    // 高階関数
    var n1 : Int = calcB(5, 10, ::calcA)
    println("n1 = $n1")

    // func: (Int, Int) -> Int
    //（関数が受け取るデータ型） -> 関数が返却するデータ型

    // ラムダ式
    var n2:Int = calcB(5, 10){ x:Int, y:Int -> x + y }
    println("n2 = $n2")

    // it
    var num:Int = funcB(10) {it + 1}
    println(num)
}

fun calcA(a: Int, b: Int) = a + b

fun calcB(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)

fun funcA(a: Int) = a + 1

fun funcB(a: Int, func: (Int) -> (Int)) = func(a)