package cl.ravenhill.delivery

/**
 * Handles and prints whether the order state is final or intermediate based on the provided `DeliveryState` enum.
 *
 * ## Usage:
 * This function takes an order state as a `DeliveryState` enum and prints whether it is a final or intermediate state.
 *
 * ### Example 1: Handling Final Order States
 * ```
 * handleOrderState(DeliveryState.DELIVERED)  // Output: Final state: DELIVERED
 * handleOrderState(DeliveryState.CANCELLED)  // Output: Final state: CANCELLED
 * ```
 *
 * ### Example 2: Handling Intermediate Order States
 * ```
 * handleOrderState(DeliveryState.PENDING)    // Output: Intermediate state: PENDING
 * handleOrderState(DeliveryState.PAID)       // Output: Intermediate state: PAID
 * ```
 *
 * @param orderState The state of the order as a `DeliveryState` enum.
 */
fun handleOrderState(orderState: DeliveryState) =
    if (orderState.isFinalState()) println("Final state: ${orderState.name}")
    else println("Intermediate state: ${orderState.name}")

// Handle the order state based on the provided `DeliveryState` enum.
//fun handleOrderState(orderState: DeliveryState) {
//    when (orderState) {
//        DeliveryState.PENDING -> println("Order is pending")
//        DeliveryState.PAID -> println("Order is paid")
//        DeliveryState.SHIPPED -> println("Order is shipped")
//        DeliveryState.DELIVERED -> println("Order is delivered")
//        DeliveryState.CANCELLED -> println("Order is cancelled")
//        // No need for an `else` branch since all possible states are covered by the enum
//    }
//}
