package cl.ravenhill.delivery

/**
 * Represents the cancelled state of a delivery with a reason.
 *
 * ## Usage:
 * This data class is used to represent the cancelled state in the delivery state machine, providing specific
 * implementations of the `signal` and `isFinalState` methods.
 *
 * ### Example 1: Using the Cancelled State
 * ```
 * val cancelledState = Cancelled("customer requested")
 * println(cancelledState.signal()) // Output: Order is cancelled because customer requested
 * println(cancelledState.isFinalState()) // Output: true
 * ```
 * @property reason The reason for the cancellation.
 * @see DeliveryState
 */
data class Cancelled(val reason: String) : DeliveryState() {
    override fun signal() = "Order is cancelled because $reason"
    override fun isFinalState() = true
}
