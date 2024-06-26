package Car

open class Car { // open -> 상속 가능
    var color : String = ""
    var speed : Int = 0

    // companion object = static
    companion object {
        var carCount : Int = 0
        const val MAXSPEED : Int = 200
        const val MINSPEED : Int = 0
        fun currentCarCount() : Int {
            return carCount
        }
    }

     constructor(color : String, speed : Int) {
         this.color = color
         this.speed = speed
         carCount++
     }

    // 메서드 오버로딩: 같은 이름의 함수에 파라미터, 변수 타입등을 변경하여 다시 사용하는 것을 의미한다.
    constructor(speed: Int) {
        this.speed = speed
    }

    constructor() {}

    open fun upSpeed(value: Int) {
        if (speed + value >= MAXSPEED) {
            print("과속 단속에 걸린 차량, ")
            speed = 200
        }
        else
            speed += value
    }

    open fun downSpeed(value: Int) {
        if (speed - value <= MINSPEED) {
            println("차가 정지하였습니다.")
            speed = 0
        }
        else
            speed -= value
    }
}