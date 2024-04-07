package Car

class Automobile : Car{
    var seatNum : Int = 0

    constructor() {
        this.color = "검정색"
        this.speed = 120
    }

    fun countSeatNum() : Int {
        return seatNum
    }

    override fun upSpeed(value: Int) {
        if (speed+value >= 300)
            speed = 300
        else
            speed += value
    }

}