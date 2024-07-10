package cl.ravenhill.delivery

/**
 * Lists and prints all possible order states defined in the `DeliveryState` enum.
 *
 * ## Usage:
 * This function prints all entries of the `DeliveryState` enum, one per line.
 *
 * ### Example 1: Listing All Order States
 * ```
 * listOrderStates()
 * // Output:
 * // PENDING
 * // PAID
 * // SHIPPED
 * // DELIVERED
 * // CANCELLED
 * ```
 *
 * @return Unit. Prints each `DeliveryState` enum entry.
 */
fun listOrderStates() = DeliveryState.entries.forEach { println(it) }
