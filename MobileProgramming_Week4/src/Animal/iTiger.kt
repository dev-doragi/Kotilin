package Animal

class iTiger : Animal(), iAnimal {
    override fun move() {
        println("4족 보행한다.")
    }

    override fun eat() {
        println("멧돼지를 먹는다.")
    }
}