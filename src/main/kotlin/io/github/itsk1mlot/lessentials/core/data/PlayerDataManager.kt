package io.github.itsk1mlot.lessentials.core.data

import kotlinx.serialization.json.Json
import java.io.File
import java.util.UUID

object PlayerDataManager {

    val loaded = mutableMapOf<UUID, PlayerData>()

    fun load(file: File) {
        val text = file.readText()
        val map = decodeFromString<Map<String, PlayerData>>(text)
    }

    fun save(file: File) {

    }

    fun saveDefault(file: File) {
        if(!file.exists()) {
            file.createNewFile()
            file.writeText("{}")
        }
    }

}

@Serializable
data class PlayerData(
    var isVanished: Boolean = false
)