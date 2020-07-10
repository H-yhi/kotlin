fun main() {
    /*
    *　・変数（var）  ：変更可能
    *　・定数（val）  ：変更不可
    *　・型推論       ：代入する値でデータ型を判断する
    *　・データ型　　  ：「数値」「文字列」など、値を種類
    *　*/

    // 変数
    var num = 10
    // ""の中で$を使えば変数を展開できる
    println("num = $num")
    // データ型を確認する
    println(num::class)

    var str = "Hello"
    println("str = $str")
    println(str::class)

    // 定数
    var num2 = 20
    println("num2 = $num2");
}