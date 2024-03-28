fun main() {
    var var1: Int = 10;
    var var2: Float = 10.1f
    var var3: Double = 10.2
    var var4: Char = '안'
    var var5: String = "안드로이드"

    println(var1)
    println(var2)
    println(var3)
    println(var4)
    println(var5)

    println()
    println("=====================================================")
    println()

    var var11 = 10
    var var22 = 10.1f
    var var33 = 10.1
    var var44 = '안'
    var var55 = "안드로이드"

    val val1 = 15
//    val1 = 20

    //var var1 = 15
    var1 = 20

    println(var11)
    println(var22)
    println(var33)
    println(var44)
    println(var55)

    println()
    println("=====================================================")
    println()

    var a : Int = "100".toInt()
    var b : Double = "100.231".toDouble()

    println(a)
    println(b)

    println()
    println("=====================================================")
    println()

    var notNull : Int? = null
    println(notNull)

    var ary = ArrayList<Int>(1)

    ary!!.add(100)
    print(ary)
    ary.add(200)
    print(ary)

}