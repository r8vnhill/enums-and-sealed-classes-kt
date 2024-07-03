package cl.ravenhill.media

/**
 * Sealed interface representing media that can be played and paused.
 *
 * ## Usage:
 * This sealed interface defines the contract for media types, requiring implementations of the `play` and `pause`
 * methods.
 *
 * ### Example 1: Using Media with a Music Instance
 * ```
 * val media: Media = Music("Dile", "Don Omar")
 * when (media) {
 *     is Music -> {
 *         media.play()  // Output: Playing Dile by Don Omar
 *         media.pause() // Output: Pausing Dile by Don Omar
 *         media.skip()  // Output: Skipping Dile by Don Omar
 *     }
 *     is Video -> {
 *         // Not applicable in this example
 *     }
 * }
 * ```
 *
 * ### Example 2: Using Media with a Video Instance
 * ```
 * val media: Media = Video("Dead Poets Society", 128)
 * when (media) {
 *     is Music -> {
 *         // Not applicable in this example
 *     }
 *     is Video -> {
 *         media.play()         // Output: Playing Inception
 *         media.pause()        // Output: Pausing Inception
 *         media.fastForward()  // Output: Fast forwarding Inception
 *     }
 * }
 * ```
 * @see Music
 * @see Video
 */
sealed interface Media {
    /**
     * Plays the media.
     */
    fun play()

    /**
     * Pauses the media.
     */
    fun pause()
}
