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
import org.openapitools.model.Color
import org.openapitools.model.Level
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
 * @param id 
 * @param createdAt 
 * @param day 
 * @param price 
 * @param big 
 * @param link 
 * @param color 
 * @param level 
 * @param status 
 * @param tags 
 * @param ids 
 * @param meta 
 * @param free 
 * @param anything 
 * @param dollarSpecial 
 * @param withDefault 
 * @param nullableField 
 */
@Serializable
data class Thing(

    @SerialName("id") val id: java.util.UUID,

    @SerialName("created_at") val createdAt: java.time.OffsetDateTime,

    @field:Valid
    @SerialName("day") val day: java.time.LocalDate? = null,

    @SerialName("price") val price: java.math.BigDecimal? = null,

    @SerialName("big") val big: kotlin.Long? = null,

    @field:Valid
    @SerialName("link") val link: java.net.URI? = null,

    @field:Valid
    @SerialName("color") val color: Color? = null,

    @field:Valid
    @SerialName("level") val level: Level? = null,

    @SerialName("status") val status: Thing.Status? = null,

    @SerialName("tags") val tags: kotlin.collections.List<Thing.Tags>? = null,

    @field:Valid
    @SerialName("ids") val ids: kotlin.collections.List<java.util.UUID>? = null,

    @field:Valid
    @SerialName("meta") val meta: kotlin.collections.Map<kotlin.String, java.time.OffsetDateTime>? = null,

    @field:Valid
    @SerialName("free") val free: kotlinx.serialization.json.JsonElement? = null,

    @field:Valid
    @SerialName("anything") val anything: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("\$special") val dollarSpecial: kotlin.String? = null,

    @SerialName("withDefault") val withDefault: kotlin.String? = "hello",

    @SerialName("nullableField") val nullableField: kotlin.String? = null
) {

    /**
    * 
    * Values: new,in_progress,done
    */
    @Serializable(with = Status.Serializer::class)
    enum class Status(val value: kotlin.String) {

        new("new"),
        in_progress("in progress"),
        done("done");
    
        companion object {
            @JvmStatic
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Status'")
            }
        }

        object Serializer : EnumValueSerializer<Status, kotlin.String>(
            "org.openapitools.model.Thing.Status",
            serializer<kotlin.String>(),
            { it.value },
            { Status.forValue(it) }
        )
    }

    /**
    * 
    * Values: a,b
    */
    @Serializable(with = Tags.Serializer::class)
    enum class Tags(val value: kotlin.String) {

        a("a"),
        b("b");
    
        companion object {
            @JvmStatic
            fun forValue(value: kotlin.String): Tags {
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Tags'")
            }
        }

        object Serializer : EnumValueSerializer<Tags, kotlin.String>(
            "org.openapitools.model.Thing.Tags",
            serializer<kotlin.String>(),
            { it.value },
            { Tags.forValue(it) }
        )
    }

}

