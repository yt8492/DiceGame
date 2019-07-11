fun main() {
    println("What is your name?")
    val playerName = readLine() ?: run {
        println("Please input your name.")
        return
    }
    val player = Player(playerName)
    DiceGame(player).play()
}