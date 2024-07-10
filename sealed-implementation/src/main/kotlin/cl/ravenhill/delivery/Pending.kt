package cl.ravenhill.delivery

/**
 * Represents the pending state of a delivery.
 *
 * ## Usage:
 * This data object is used to represent the pending state in the delivery state machine, providing a specific
 * implementation of the `signal` method.
 *
 * ### Example 1: Using the Pending State
 * ```
 * val pendingState = Pending
 * println(pendingState.signal()) // Output: Order is pending
 * println(pendingState.isFinalState()) // Output: false
 * ```
 * @see DeliveryState
 */
data object Pending : DeliveryState() {
    override fun signal() = "Order is pending"
}
