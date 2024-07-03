package cl.ravenhill.delivery

/**
 * Represents the shipped state of a delivery with a tracking number.
 *
 * ## Usage:
 * This data class is used to represent the shipped state in the delivery state machine, providing a specific implementation of the `signal` method.
 *
 * ### Example 1: Using the Shipped State
 * ```
 * val shippedState = Shipped("123456789")
 * println(shippedState.signal()) // Output: Order is shipped with tracking number 123456789
 * println(shippedState.isFinalState()) // Output: false
 * ```
 * @property trackingNumber The tracking number associated with the shipped order.
 * @see DeliveryState
 */
data class Shipped(val trackingNumber: String) : DeliveryState() {
    override fun signal() = "Order is shipped with tracking number $trackingNumber"
}
