package cl.ravenhill.delivery

/**
 * Handles the state of an order by printing the corresponding message, indicating whether it is a final state.
 *
 * ## Usage:
 * This function takes a [DeliveryState] and prints a message based on whether the state is a final state or not.
 *
 * ### Example 1: Handling a Non-final State
 * ```
 * val state = Paid
 * handleOrderState(state)
 * // Output: Non-final state: Order is paid
 * ```
 * ### Example 2: Handling a Final State
 * ```
 * val state = Delivered
 * handleOrderState(state)
 * // Output: Final state: Order is delivered
 * ```
 * @param state The state of the order as a [DeliveryState].
 */
fun handleOrderState(state: DeliveryState) = if (state.isFinalState())
    println("Final state: ${state.signal()}")
else println("Non-final state: ${state.signal()}")

fun main() {
    handleOrderState(Pending)
    handleOrderState(Paid)
    handleOrderState(Shipped("123"))
    handleOrderState(Delivered)
    handleOrderState(Cancelled("no stock"))
}
