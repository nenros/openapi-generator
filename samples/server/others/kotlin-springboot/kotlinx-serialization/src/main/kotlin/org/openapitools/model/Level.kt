@file:UseSerializers(
    BigDecimalSerializer::class,
    BigIntegerSerializer::class,
    InstantSerializer::class,
    LocalDateSerializer::class,
    LocalDateTimeSerializer::class,
    LocalTimeSerializer::class,
    OffsetDateTimeSerializer::class,
    URISerializer::class,
    URLSerializer::class,
    UUIDSerializer::class,
)

package org.openapitools.model

import java.util.Objects
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import kotlinx.serialization.json.JsonClassDiscriminator
import kotlinx.serialization.serializer
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

/**
 * 
 * Values: _1,_2,_3
 */
@Serializable(with = Level.Serializer::class)
enum class Level(val value: kotlin.Int) {

    _1(1),
    _2(2),
    _3(3);

    companion object {
        @JvmStatic
        fun forValue(value: kotlin.Int): Level {
            return values().firstOrNull{ it.value == value }
                ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Level'")
        }
    }

    object Serializer : EnumValueSerializer<Level, kotlin.Int>(
        "org.openapitools.model.Level",
        serializer<kotlin.Int>(),
        { it.value },
        { Level.forValue(it) }
    )
}
