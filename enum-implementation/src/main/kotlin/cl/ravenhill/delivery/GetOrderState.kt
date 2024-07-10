package cl.ravenhill.delivery

/**
 * Retrieves the `DeliveryState` enum value corresponding to the provided name.
 *
 * ## Usage:
 * This function takes a string representing the name of a delivery state and returns the corresponding `DeliveryState`
 * enum value.
 *
 * ### Example 1: Getting a DeliveryState by Name
 * ```
 * val state = getOrderState("SHIPPED")
 * println(state) // Output: SHIPPED
 * ```
 *
 * ### Example 2: Handling Invalid State Names
 * ```
 * try {
 *     val state = getOrderState("INVALID")
 * } catch (e: IllegalArgumentException) {
 *     println(e.message) // Output: No enum constant DeliveryState.INVALID
 * }
 * ```
 *
 * @param name The name of the delivery state.
 * @return The `DeliveryState` enum value corresponding to the provided name.
 * @throws IllegalArgumentException if the name does not correspond to any `DeliveryState` enum value.
 */
fun getOrderState(name: String) = DeliveryState.valueOf(name)
