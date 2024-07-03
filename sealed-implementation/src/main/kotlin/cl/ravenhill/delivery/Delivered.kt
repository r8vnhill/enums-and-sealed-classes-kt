package cl.ravenhill.delivery

/**
 * Represents the delivered state of a delivery.
 *
 * ## Usage:
 * This data object is used to represent the delivered state in the delivery state machine, providing specific
 * implementations of the `signal` and `isFinalState` methods.
 *
 * ### Example 1: Using the Delivered State
 * ```
 * val deliveredState = Delivered
 * println(deliveredState.signal()) // Output: Order is delivered
 * println(deliveredState.isFinalState()) // Output: true
 * ```
 * @see DeliveryState
 */
data object Delivered : DeliveryState() {
    override fun signal() = "Order is delivered"
    override fun isFinalState() = true
}
