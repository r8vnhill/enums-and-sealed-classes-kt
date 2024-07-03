package cl.ravenhill.delivery

/**
 * Sealed class representing the state of a delivery.
 *
 * ## Usage:
 * This sealed class serves as the base class for different delivery states, providing a method to signal the state and
 * a method to check if the state is final.
 *
 * ### Example 1: Using Different Delivery States
 * ```
 * val pendingState: DeliveryState = Pending
 * println(pendingState.signal()) // Output: Order is pending
 * println(pendingState.isFinalState()) // Output: false
 *
 * val deliveredState: DeliveryState = Delivered
 * println(deliveredState.signal()) // Output: Order is delivered
 * println(deliveredState.isFinalState()) // Output: true
 *
 * val cancelledState: DeliveryState = Cancelled("customer request")
 * println(cancelledState.signal()) // Output: Order is cancelled because customer request
 * println(cancelledState.isFinalState()) // Output: true
 * ```
 * @property signal Abstract method to return the signal message for the state.
 * @property isFinalState Open method to check if the state is final. By default, it returns false.
 */
sealed class DeliveryState {
    /**
     * Returns a signal message representing the state.
     *
     * @return The signal message as a String.
     */
    abstract fun signal(): String

    /**
     * Checks if the state is a final state.
     *
     * @return `true` if the state is final, `false` otherwise. Default is `false`.
     */
    open fun isFinalState() = false
}

