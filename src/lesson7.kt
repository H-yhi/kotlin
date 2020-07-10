fun main() {
    /*
    * ・コレクション：複数に値（要素）をまとめて扱う
    * ・可変長（配列の固定長）
    * ・リスト：順番の概念を持つ
    * */

    var list : List<Int> = listOf(10, 20, 30)
    println(list[0])

    // 読み取り専用のためエラー
    //list[0] = 100

    var list2 : MutableList<Int> = mutableListOf(10, 20, 30)

    // 変更
    list2[0] = 100
    println(list2[0])
    println(list2)

    // 追加
    list2.add(200)
    println(list2)

    list2.add(index = 0, element = 500)
    println(list2)

    // 削除
    list2.removeAt(index = 0)
    println(list2)

    list2.remove(element = 100)
    println(list2)

}