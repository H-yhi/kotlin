import model.Charcter as ch
fun main() {

    /*
    * ・パッケージ
    * ・インポート
    * ・エイリアス（別名）
    *
    * ・（プライマリー）コンストラクタ
    * ・プロパティ宣言
    *
    * ・セカンダリコンストラクタ：複数定義
    * 　>> プライマリコンストラクタも定義されている場合は、
    * 　　　最終的にプライマリコンストラクタを呼び出す
    * ・this：他のコンストラクタを呼び出す
    * */

    // インスタンス化するときはnewではなく()
    var p1 = ch("プレイヤー１", 100)
    p1.showStatus()

    var p2 = ch("プレイヤー２")
    p2.showStatus()

    var p3 = ch(500)
    p3.showStatus()

    val p4 = ch()
    p4.showStatus()

}