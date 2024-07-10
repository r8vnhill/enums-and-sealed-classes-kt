package cl.ravenhill.game

/**
 * Interface representing an action that can be executed on a player in a game.
 *
 * ## Usage:
 * This interface defines the contract for a game action, requiring implementations to provide a method to execute the
 * action on a player.
 *
 * ### Example 1: Implementing the GameAction Interface
 * ```
 * class HealAction : GameAction {
 *     override fun execute(player: Player) {
 *         player.increaseHealth(10)
 *     }
 * }
 *
 * val player = Player(health = 50, mana = 30)
 * val healAction = HealAction()
 * healAction.execute(player)
 * println(player.health) // Output: 60
 * ```
 */
interface GameAction {
    /**
     * Executes the action on the specified player.
     *
     * @param player The player on whom the action will be executed.
     */
    fun execute(player: Player)
}
