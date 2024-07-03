package cl.ravenhill.delivery

/**
 * Lists all possible order states by returning the sealed subclasses of the [DeliveryState] class.
 *
 * ## Usage:
 * This function returns a list of all the sealed subclasses of the [DeliveryState] class, representing all possible
 * order states.
 *
 * ### Example 1: Listing all Order States
 * ```
 * val orderStates = listOrderStates()
 * println(orderStates) // Output: [class Pending, class Delivered, class Cancelled, class Paid, class Shipped]
 * ```
 * @return A list of KClass objects representing the sealed subclasses of the [DeliveryState] class.
 */
fun listOrderStates() = DeliveryState::class.sealedSubclasses
