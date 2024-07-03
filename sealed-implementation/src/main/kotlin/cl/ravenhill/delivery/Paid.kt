package cl.ravenhill.delivery

/**
 * Represents the paid state of a delivery.
 *
 * ## Usage:
 * This data object is used to represent the paid state in the delivery state machine, providing a specific
 * implementation of the `signal` method.
 *
 * ### Example 1: Using the Paid State
 * ```
 * val paidState = Paid
 * println(paidState.signal()) // Output: Order is paid
 * println(paidState.isFinalState()) // Output: false
 * ```
 * @see DeliveryState
 */
data object Paid : DeliveryState() {
    override fun signal() = "Order is paid"
}
