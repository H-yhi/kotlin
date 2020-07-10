fun main() {
    /*
    * ・コレクション：複数の値（要素）をまとめて扱う
    * ・可変長（配列は固定長）
    * ・マップ・キーと要素をセットで管理する・キーの重複は許可しない
    * */

    var map : MutableMap<String, String> = mutableMapOf<String, String>(
        "orange" to "オレンジ",
        "melon" to "メロン",
        "apple" to "アップル"
    )

    // 変更
    map["apple"] = "りんご"
    println(map)

    // 追加
    map["banana"] = "バナナ"
    println(map)

    // 削除
    map.remove(key = "apple")
    println(map)
}