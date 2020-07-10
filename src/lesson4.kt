fun main() {
    /*
    * ・型変換メソッド（toXX）
    * ・メソッド：クラスが持っている関数（プログラムがまとめたもの）
    * */

    // 以下のような代入はできない
    // val x: Int = 10
    // val y: Long = x

    var x : Int = 10
    var y: Long = x.toLong()
    println(y)

    var d: Double = x.toDouble()
    println(d)

    var dd = 1.6
    var i:Int = dd.toInt()
    println(i)


}