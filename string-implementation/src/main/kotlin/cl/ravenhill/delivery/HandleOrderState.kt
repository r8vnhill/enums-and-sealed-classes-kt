package cl.ravenhill.delivery

// This is a bad example of a function that handles the state of an order based on a string input. It is not scalable
// and does not provide a clear structure for handling different states. It is better to use an enum or sealed class to
// represent the order states and handle them accordingly.

/**
 * Handles and prints the order state based on the provided state string.
 *
 * ## Usage:
 * This function takes an order state as a string and prints a corresponding message. If the state is not recognized, it
 * prints "Unknown state".
 *
 * ### Example 1: Handling Known Order States
 * ```
 * handleOrderState("Pending")    // Output: Order is pending
 * handleOrderState("Delivered")  // Output: Order is delivered
 * handleOrderState("Cancelled")  // Output: Order is cancelled
 * ```
 *
 * ### Example 2: Handling an Unknown Order State
 * ```
 * handleOrderState("Processing") // Output: Unknown state
 * ```
 *
 * @param state The state of the order as a string. Accepted values are "Pending", "Paid", "Shipped", "Delivered", and
 *  "Cancelled".
 */
fun handleOrderState(state: String) = when (state) {
    "Pending" -> println("Order is pending")
    "Paid" -> println("Order is paid")
    "Shipped" -> println("Order is shipped")
    "Delivered" -> println("Order is delivered")
    "Cancelled" -> println("Order is cancelled")
    else -> println("Unknown state")
}
