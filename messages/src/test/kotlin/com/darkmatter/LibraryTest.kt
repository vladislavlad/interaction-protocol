package com.darkmatter

import com.darkmatter.model.SystemEvent
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.util.*

class LibraryTest : StringSpec({

    "test" {
        val event = SystemEvent(
            UUID.randomUUID(),
            "system",
            "New event"
        )

        event.message shouldBe "New event"
    }
})
