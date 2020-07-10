fun main() {
    /*
    *　・型推論
    *　・データ型の種類
    *　・データ型を指定する
    *　*/

    // 型推論：代入する値で自動的にデータ型を識別する
    var x = 10
    val y = 1.0
    var z = "hello"
    println("x = ${x::class}")
    println("y = ${y::class}")
    println("z = ${z::class}")

    // 整数
    var num1: Int = 10   // 32 bit
    var num2: Long = 10  // 64 bit
    var num3: Short = 10 // 16 bit
    var num4: Byte = 10  // 8 bit

    // 少数
    var num5: Double = 1.0 // 64 bit
    var num6: Float = 1.0F // 32 bit

    // 整数　符号なし
    // Byte型は128以上で指定するとエラーになる
    // var num7: Byte = 128
    // Unsigned Byteを使うと解決する
    var num7: UByte = 128U

    // 進数表現
    var num8 = 0xF0
    var num9 = 0b1111_0000
    println(num8)
    println(num9)

    // 文字列、文字
    var str: String = "Hello"
    var ch: Char = 'S'

    // 真偽 boolean
    // true false
    // var bool: boolean = true
    println(10 > 5)
    println(10 < 5)

    // Any（どんな型でも代入できる）
    var any: Any = 10
    any = "Hello"
    any = 'S'
}