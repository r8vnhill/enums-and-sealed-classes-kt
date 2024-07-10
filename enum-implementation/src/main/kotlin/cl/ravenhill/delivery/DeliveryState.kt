package cl.ravenhill.delivery

/**
 * Enum representing the possible states of a delivery, each with its own signal message.
 *
 * ## Usage:
 * This enum class defines the possible states for a delivery: `PENDING`, `PAID`, `SHIPPED`, `DELIVERED`, and
 * `CANCELLED`. Each state provides a custom signal message. The class also includes a method to check if the state is
 * final.
 *
 * ### Example 1: Using the DeliveryState Enum and Getting Signal Messages
 * ```
 * val currentState = DeliveryState.PENDING
 * println(currentState.signal()) // Output: Order is pending
 *
 * val deliveredState = DeliveryState.DELIVERED
 * println(deliveredState.signal()) // Output: Order is delivered
 * ```
 *
 * ### Example 2: Checking if a State is Final
 * ```
 * val state = DeliveryState.CANCELLED
 * println(state.isFinalState()) // Output: true
 *
 * val state2 = DeliveryState.PAID
 * println(state2.isFinalState()) // Output: false
 * ```
 *
 * @property PENDING The order is pending.
 * @property PAID The order is paid.
 * @property SHIPPED The order is shipped.
 * @property DELIVERED The order is delivered.
 * @property CANCELLED The order is cancelled.
 * @method signal Provides a message describing the current state.
 * @method isFinalState Checks if the state is final (either `DELIVERED` or `CANCELLED`).
 */
enum class DeliveryState : State {
    PENDING {
        override fun signal() = "Order is pending"
    },
    PAID {
        override fun signal() = "Order is paid"
    },
    SHIPPED {
        override fun signal() = "Order is shipped"
    },
    DELIVERED {
        override fun signal() = "Order is delivered"
    },
    CANCELLED {
        override fun signal() = "Order is cancelled"
    };

    /**
     * Checks if the state is final (either `DELIVERED` or `CANCELLED`).
     *
     * @return `true` if the state is `DELIVERED` or `CANCELLED`, otherwise `false`.
     */
    override fun isFinalState() = this == DELIVERED || this == CANCELLED
}
