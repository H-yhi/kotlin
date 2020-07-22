package model

    /*
    * ・オブジェクト指向
    * ・プロパティとメソッドをまとめて管理する
    * */

// varを宣言するとプロパティとinitが不要
class Charcter(var name: String, var hp: Int){
    /*var name: String
    var hp:   Int

    init {
        this.name = name
        this.hp   = hp
    }*/

    constructor(name: String): this(name, 50){
        println("＊＊セカンダリ＊＊")
    }
    constructor(hp: Int): this("プレイヤー３", hp)
    constructor(): this("プレイヤー４", 10)

    fun showStatus(){
        println("名前：$name")
        println("HP：$hp")
    }
}