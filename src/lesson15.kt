fun main() {
    /*
    * ・for
    * ・配列、リスト、マップ
    * */

    // 配列
    var array : Array<String> = arrayOf<String>("りんご", "みかん", "ぶどう")
    for(fruits : String in array){
        println(fruits)
    }

    //リスト
    var list : List<String> = listOf<String>("東京", "大阪", "京都")
    for(place : String in list){
        println(place)
    }

    //indexも同時に取得する
    var list2 : List<String> = listOf<String>("東京", "大阪", "京都")
    for((index : Int, place : String) in list2.withIndex()){
        println("$index = $place")
    }

    //indexを指定する
    var list3 : List<String> = listOf<String>("東京", "大阪", "京都")
    for(index : Int in list3.indices){
        println(list3[1])
    }

    //マップ
    val map : Map<Int, String> = mapOf<Int, String>(
            1 to "one",
            2 to "two",
            3 to "three"
    )

    for(data : Map.Entry<Int, String> in map){
        println(data)
    }
    //keyとvalueを別で出力する
    for((key : Int, value : String) in map)
        println("$key = $value")
}