fun main() {
    var score : Int = 100
    if (score >= 90) {
        println("if문: 합격(장학생)")
    } else if (score >= 60) {
        println("if문: 합격")
    } else {
        println("if문: 불합격")
    }

    var jumsu : Int = (score / 10) * 10
    when (jumsu) {
        100 -> println("when문: 합격(장학생)")
        90 -> println("when문: 합격(장학생)")
        80, 70, 60 -> println("when문: 합격")
        else -> println("when문: 불합격")
    }

    var jumsu_2 : Int = score
    when (jumsu_2) {
        in 90 .. 100 -> println("when문: 합격(장학생")
        in 60 .. 89 -> println("when문: 합격")
        else -> println("when문: 불합격")
    }

    println()
    println("=====================================================")
    println()

    var one = Array<Int>(4, {0})
    one[0] = 10
    one[3] = 40
    println(one.contentToString())

    println()
    println("=====================================================")
    println()

    var two = Array<IntArray>(3, {IntArray(4)})
    two[0][0] = 100
    two[0][1] = 200

    println(two[0][0])
    println(two[0][1])
    println(two.indices)
    println(two.contentToString())

    println()
    println("=====================================================")
    println()

    var three = ArrayList<Int>(4)
    three.add(10)
    three.add(20)

    println(three.size)

    var hap = three.get(0) + three.get(1)
    println(hap)

    println()
    println("=====================================================")
    println()

    // 배열.indices -> 배열 요소에 하나씩 접근하는 함수
    var four : IntArray = intArrayOf(10,20,30,40)
    for (i in four.indices) {
        println(four[i])
    }
}