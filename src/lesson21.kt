fun main() {
    /*
    * ・戻り値を複数返す
    * ・Triple：３つ
    * */

    var (sum : Int, max : Int, min : Int) = sumMaxMin(20, 10, 50, 30, 40)
    println("sum = $sum")
    println("max = $max")
    println("min = $min")

    var triple : Triple<Int, Int, Int> = sumMaxMin(20, 10, 50, 30, 40)
    println("first = ${triple.first}")
    println("second = ${triple.second}")
    println("third = ${triple.third}")
}

fun sumMaxMin(vararg array: Int): Triple<Int, Int, Int>{
    var sum = 0
    var max = 0
    var min = 10

    for(num : Int in array){
        sum += num
        if(max < num)
            max = num
        if(min > num)
            min = num
    }
    return Triple(sum, max, min)
}