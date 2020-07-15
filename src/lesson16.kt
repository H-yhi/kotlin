fun main() {
    /*
    * ・ループ制御
    * ・break    ：脱出
    * ・continue ：スキップ
    * ・ラベル
    * */

    // break
    for(i : Int in 0..10){
        if(i == 5){
            break
        }
        println("i1 = $i")
    }

    // continue
    for(i : Int in 0..10){
        if(i%2 == 0){
            continue
        }
        println("i2 = $i")
    }

    // break2
    for(i : Int in 0..10){
        for(j : Int in 0..10){
            if(j == 5){
                break
            }
            print("j = $j ")
        }
        println()
    }

    // ラベル
    outer@for(i : Int in 0..10){
        for(j : Int in 0..10){
            if(j == 5){
                break@outer
            }
            print("j2 = $j")
        }
        println()
    }
}