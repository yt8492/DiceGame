class DiceGame(private val player: Player) {
    private val dice1 = Die()
    private val dice2 = Die()
    private val dice3 = Die()

    fun play() {
        println("Hello, ${player.name}!")
        println("Rolling the dice...")
        dice1.roll()
        dice2.roll()
        dice3.roll()
        val value1 = dice1.getFaceValue()
        val value2 = dice2.getFaceValue()
        val value3 = dice3.getFaceValue()
        println("Die 1: $value1")
        println("Die 2: $value2")
        println("Die 3: $value3")
        val total = value1 + value2 + value3
        println("Total value: $total")
        if (total > 10) {
            println("${player.name} won!")
        } else {
            println("${player.name} lose.")
        }
    }
}