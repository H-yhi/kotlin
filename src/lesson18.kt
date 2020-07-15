fun main() {
    /*
    * ・可変長引数 ：引数の個数を可変長にする
    * */

    println(union(1,2,3,4))

    var intArray : IntArray = intArrayOf(1, 2, 3, 4, 5)
    // スプレッド演算子
    println(union(*intArray))
}

fun union(vararg array: Int): String{
    var str = ""
    for(num : Int in array){
        str += num
    }
    return str
}