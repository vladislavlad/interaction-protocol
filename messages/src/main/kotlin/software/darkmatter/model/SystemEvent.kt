package software.darkmatter.model

import java.util.UUID

data class SystemEvent(
    val id: UUID,
    val system: String,
    val message: String,
)
