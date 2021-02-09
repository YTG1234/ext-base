package io.github.ytg1234.kordextbackgroundcat.util

import com.kotlindiscord.kord.extensions.ExtensibleBot
import dev.kord.core.event.message.MessageCreateEvent
import io.github.ytg1234.kordextbackgroundcat.BackgroundCatExtension

/**
 * An extension function that adds the [BackgroundCatExtension]
 * to a bot.
 *
 * @receiver The bot to add the extension to.
 */
fun ExtensibleBot.backgroundcatExt(check: (suspend (MessageCreateEvent) -> Boolean)? = null) {
    addExtension { BackgroundCatExtension(it, check) }
}
