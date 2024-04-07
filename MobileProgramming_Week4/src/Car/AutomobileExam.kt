import Car.Automobile

fun main () {
    var auto : Automobile = Automobile()
    auto.upSpeed(250)
    println(auto.color)
    println("승용차의 속도는 " + auto.speed + "Km/h 입니다.")
}