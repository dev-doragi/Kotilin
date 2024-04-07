package BasicExam

fun main() {
    println()
    println("=====================================================")
    println()

    var one : IntArray = intArrayOf(10,20,30)
    for (i in one.indices) {
        println(one[i])
    }

    println()
    println("=====================================================")
    println()

    for (value in one) {
        println(value)
    }

    println()
    println("=====================================================")
    println()

    var two : Array<String> = arrayOf("하나", "둘", "셋")
    for (i in 0..2 step 1) {
        println(two[i])
    }

    println()
    println("=====================================================")
    println()

    var k : Int = 0
    while(k < two.size) {
        println(two[k])
        k++
    }
}