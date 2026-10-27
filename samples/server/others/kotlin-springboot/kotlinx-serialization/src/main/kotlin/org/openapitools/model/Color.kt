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
 * Values: red,green,darkMinusBlue
 */
@Serializable(with = Color.Serializer::class)
enum class Color(val value: kotlin.String) {

    red("red"),
    green("green"),
    darkMinusBlue("dark-blue");

    companion object {
        @JvmStatic
        fun forValue(value: kotlin.String): Color {
            return values().firstOrNull{ it.value == value }
                ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Color'")
        }
    }

    object Serializer : EnumValueSerializer<Color, kotlin.String>(
        "org.openapitools.model.Color",
        serializer<kotlin.String>(),
        { it.value },
        { Color.forValue(it) }
    )
}
