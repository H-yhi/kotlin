fun main() {
    /*
    * ・配列：複数の値（要素）を保存する箱
    *　*/

    val array: Array<Int> = arrayOf(10, 20, 30)
    println(array[0])
    println(array[1])
    println(array[2])
    // println(array[3])

    array[0] = 100
    println(array[0])

    // ラムダ式
    array.forEach { println(it) }

    var array1: IntArray = intArrayOf(10, 20)
    var array2: DoubleArray = doubleArrayOf(10.0, 20.0)
    // null許容型のデータ型
    var array3: Array<String?> = arrayOfNulls<String>(size = 5)
    array3.forEach { println(it) }
}