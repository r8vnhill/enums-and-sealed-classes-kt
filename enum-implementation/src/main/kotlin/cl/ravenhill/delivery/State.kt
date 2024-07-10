package cl.ravenhill.delivery

/**
 * Interface representing a state with a signal message and a final state check.
 *
 * ## Usage:
 * This interface defines the contract for a state, requiring implementations to provide methods to get a signal message
 * and check if the state is final.
 *
 * ### Example 1: Implementing the State Interface
 * ```
 * class ExampleState : State {
 *     override fun signal(): String {
 *         return "Example state signal"
 *     }
 *
 *     override fun isFinalState(): Boolean {
 *         return false
 *     }
 * }
 *
 * val state = ExampleState()
 * println(state.signal()) // Output: Example state signal
 * println(state.isFinalState()) // Output: false
 * ```
 */
interface State {
    /**
     * Provides a message describing the current state.
     *
     * @return A string message describing the current state.
     */
    fun signal(): String

    /**
     * Checks if the state is final.
     *
     * @return `true` if the state is final, otherwise `false`.
     */
    fun isFinalState(): Boolean
}
