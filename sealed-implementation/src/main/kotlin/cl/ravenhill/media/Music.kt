package cl.ravenhill.media

/**
 * Represents a music track with a title and artist.
 *
 * ## Usage:
 * This data class models a music track and provides methods to play, pause, and skip the track.
 *
 * ### Example 1: Playing a Music Track
 * ```
 * val music = Music("Ace of Spades", "Motörhead")
 * music.play() // Output: Playing Shape of You by Ed Sheeran
 * music.pause() // Output: Pausing Shape of You by Ed Sheeran
 * music.skip() // Output: Skipping Shape of You by Ed Sheeran
 * ```
 * @property title The title of the music track.
 * @property artist The artist of the music track.
 * @see Media
 */
data class Music(val title: String, val artist: String) : Media {
    override fun play() = println("Playing $title by $artist")

    override fun pause() = println("Pausing $title by $artist")

    /**
     * Skips the current music track.
     */
    fun skip() = println("Skipping $title by $artist")
}
