package cl.ravenhill.game

/**
 * Represents a player in a game with health and mana attributes.
 *
 * ## Usage:
 * This class represents a player in a game with attributes for health and mana. It provides methods to increase and
 * decrease these attributes.
 *
 * ### Example 1: Creating a Player and Modifying Health and Mana
 * ```
 * val player = Player(health = 100, mana = 50)
 * player.increaseHealth(10)
 * println(player.health) // Output: 110
 * player.decreaseMana(20)
 * println(player.mana) // Output: 30
 * ```
 *
 * @property health The current health of the player. It can be increased or decreased using the provided methods.
 * @property mana The current mana of the player. It can be increased or decreased using the provided methods.
 */
class Player(health: Int, mana: Int) {
    var health = health
        private set
    var mana = mana
        private set

    /**
     * Increases the player's health by the specified amount.
     *
     * ## Usage:
     * ### Example 1: Increasing Health
     * ```
     * val player = Player(health = 100, mana = 50)
     * player.increaseHealth(10)
     * println(player.health) // Output: 110
     * ```
     *
     * @param amount The amount to increase the health by.
     */
    fun increaseHealth(amount: Int) {
        health += amount
    }

    /**
     * Decreases the player's health by the specified amount.
     *
     * ## Usage:
     * ### Example 1: Decreasing Health
     * ```
     * val player = Player(health = 100, mana = 50)
     * player.decreaseHealth(20)
     * println(player.health) // Output: 80
     * ```
     *
     * @param amount The amount to decrease the health by.
     */
    fun decreaseHealth(amount: Int) {
        health -= amount
    }

    /**
     * Increases the player's mana by the specified amount.
     *
     * ## Usage:
     * ### Example 1: Increasing Mana
     * ```
     * val player = Player(health = 100, mana = 50)
     * player.increaseMana(20)
     * println(player.mana) // Output: 70
     * ```
     *
     * @param amount The amount to increase the mana by.
     */
    fun increaseMana(amount: Int) {
        mana += amount
    }

    /**
     * Decreases the player's mana by the specified amount.
     *
     * ## Usage:
     * ### Example 1: Decreasing Mana
     * ```
     * val player = Player(health = 100, mana = 50)
     * player.decreaseMana(10)
     * println(player.mana) // Output: 40
     * ```
     *
     * @param amount The amount to decrease the mana by.
     */
    fun decreaseMana(amount: Int) {
        mana -= amount
    }
}

fun main() {
    val player = Player(health = 100, mana = 50)
    player.increaseHealth(amount = 10)
    println(player.health) // Output: 110
    player.decreaseMana(amount = 20)
    println(player.mana) // Output: 30
}
