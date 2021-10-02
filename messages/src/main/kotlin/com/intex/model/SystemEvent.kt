package com.intex.model

import java.util.*

data class SystemEvent(
    val id: UUID,
    val system: String,
    val message: String,
)
