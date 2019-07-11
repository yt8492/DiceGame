class DiceGame(private val player: Player) {
    private val dice1 = Die()
    private val dice2 = Die()

    fun play() {
        println("Hello, ${player.name}!")
        println("Rolling the dice...")
        dice1.roll()
        dice2.roll()
        val value1 = dice1.getFaceValue()
        val value2 = dice2.getFaceValue()
        println("Die 1: $value1")
        println("Die 2: $value2")
        val total = value1 + value2
        println("Total value: $total")
        if (total > 7) {
            println("${player.name} won!")
        } else {
            println("${player.name} lose.")
        }
    }
}