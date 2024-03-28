package Car

fun main() {
    var myCar1 : Car = Car("빨강", 0)
    var myCar2 : Car = Car("파랑", 0)
    var myCar3 : Car = Car("초록", 0)

    println("생산된 차의 수(정적 필드) ==> " + Car.carCount)
    println("생산된 차의 수(정적 메서드) ==> " + Car.currentCarCount())
    println("제한 속도 " + Car.MAXSPEED + "Km/h 미만")

    println()
    println("=====================================================")
    println()

    myCar1.upSpeed(50)
    println("Car1의 색상은 " + myCar1.color + "이며 속도는 " + myCar1.speed + "이다.")

    myCar2.upSpeed(20)
    println("Car2의 색상은 " + myCar2.color + "이며 속도는 " + myCar2.speed + "이다.")

    myCar3.upSpeed(259)
    println("Car3의 색상은 " + myCar3.color + "이며 속도는 " + myCar3.speed + "이다.")

    println()
    println("=====================================================")
    println()

    println("PI의 값 = " + Math.PI)
    println("3의 5승 = " + Math.pow(3.0, 5.0))

}