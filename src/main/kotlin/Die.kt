import kotlin.random.Random

class Die {
    private var faceValue = 1

    fun roll() {
        faceValue = Random.nextInt(1, 7)
    }

    fun getFaceValue() = faceValue
}