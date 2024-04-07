package Animal

fun main(){
    var tiger1 = Tiger()
    var eagle1 = Eagle()

    tiger1.move()
    eagle1.move()

    println()
    println("=====================================================")
    println()

    var animal1 : Animal
    animal1 = Tiger()
    animal1.move()

    var animal2 : Animal
    animal2 = Eagle()
    animal2.move()

    println()
    println("=====================================================")
    println()

    var cat = iCat()
    cat.eat()

    var tiger = iTiger()
    tiger.move()
    tiger.eat()
}