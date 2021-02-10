package io.github.ytg1234.kordextbackgroundcat.config

/**
 * Describes what happens when two log processors with the same ID are registered.
 *
 * @since 1.0.1
 * @author YTG1234
 */
enum class DuplicateBehaviour {
    /**
     * The newest processor overwrites all previous processors.
     */
    OVERWRITE,

    /**
     * An exception is thrown.
     */
    CRASH,

    /**
     * The new processor is ignored and the oldest processor remains.
     */
    CANCEL
}
