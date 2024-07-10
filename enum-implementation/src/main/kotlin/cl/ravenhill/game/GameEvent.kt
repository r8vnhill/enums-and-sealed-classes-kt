package cl.ravenhill.game

/**
 * Enum representing different game events that can be executed on a player.
 *
 * ## Usage:
 * This enum class implements the [GameAction] interface and defines various game events that can be executed on a
 * player, such as increasing health, decreasing mana, and more.
 *
 * ### Example 1: Executing a Game Event on a Player
 * ```
 * val player = Player(health = 100, mana = 50)
 * GameEvent.HEALTH_BOOST.execute(player)
 * println(player.health) // Output: 120
 * GameEvent.MANA_DRAIN.execute(player)
 * println(player.mana) // Output: 35
 * ```
 *
 * @property HEALTH_BOOST Increases the player's health by 20.
 * @property MANA_DRAIN Decreases the player's mana by 15.
 * @property POISON Decreases the player's health by 10.
 * @property ENERGY_SURGE Increases the player's mana by 20.
 */
enum class GameEvent : GameAction {
    /**
     * Increases the player's health by 20.
     */
    HEALTH_BOOST {
        override fun execute(player: Player) {
            player.increaseHealth(amount = 20)
        }
    },

    /**
     * Decreases the player's mana by 15.
     */
    MANA_DRAIN {
        override fun execute(player: Player) {
            player.decreaseMana(amount = 15)
        }
    },

    /**
     * Decreases the player's health by 10.
     */
    POISON {
        override fun execute(player: Player) {
            player.decreaseHealth(amount = 10)
        }
    },

    /**
     * Increases the player's mana by 20.
     */
    ENERGY_SURGE {
        override fun execute(player: Player) {
            player.increaseMana(amount = 20)
        }
    };
}

