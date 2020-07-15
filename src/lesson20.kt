fun main() {
    /*
    * ・戻り値を複数返す
    * ・Pair：２つ
    * */

    var (sum : Int, max : Int) = sumMax(20, 10, 50, 30, 40)
    println(sum)
    println(max)
    var Pair: Pair<Int, Int> = sumMax(20, 10, 50, 30, 40)
    println(Pair)
    println(Pair.first)
    println(Pair.second)
}

fun sumMax(vararg array: Int): Pair<Int, Int>{
    var sum = 0
    var max = 0
    for(num : Int in array){
        sum += num
        if(max < num){
            max = num
        }
    }
    return Pair(sum, max)
}