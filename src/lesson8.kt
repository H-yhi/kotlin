fun main() {
    /*
    * ・コレクション：複数の値（要素）をまとめて扱う
    * ・可変長（配列の固定長）
    * ・セット：順番の概念がなく、要素の重複を許可しない
    * */

    var set : MutableSet<Int> = mutableSetOf(10, 20, 30)
    println(set)

    // 追加
    set.add(40)
    set.add(40) // 同じ要素は追加されない
    println(set)

    // 削除
    set.remove(element = 30)
    println(set)
}