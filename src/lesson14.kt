fun main() {
    /*
    * ・ループ（繰り返し）
    * ・for
    * */

    for(i : Int in 0..10){
        println("i1 = $i")
    }

    for(i : Int in 0 until 10){
        println("i2 = $i")
    }

    for(i : Int in 10 downTo 0 step 2){
        println("i3 = $i")
    }

    for(i : Int in 1..9){
        for(j : Int in 1..9){
            print(i*j)
        }
        println()
    }
}