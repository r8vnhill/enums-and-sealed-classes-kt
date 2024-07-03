package cl.ravenhill.media

/**
 * Represents a video with a title and duration.
 *
 * ## Usage:
 * This data class models a video and provides methods to play, pause, and fast-forward the video.
 *
 * ### Example 1: Playing a Video
 * ```
 * val video = Video("Le Locataire", 125)
 * video.play() // Output: Playing Inception
 * video.pause() // Output: Pausing Inception
 * video.fastForward() // Output: Fast forwarding Inception
 * ```
 * @property title The title of the video.
 * @property duration The duration of the video in minutes.
 * @see Media
 */
data class Video(val title: String, val duration: Int) : Media {
    override fun play() = println("Playing $title")

    override fun pause() = println("Pausing $title")

    /**
     * Fast forwards the current video.
     */
    fun fastForward() = println("Fast forwarding $title")
}
