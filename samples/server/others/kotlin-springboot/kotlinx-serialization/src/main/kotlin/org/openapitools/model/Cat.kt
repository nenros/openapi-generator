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
import org.openapitools.model.Pet
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
 * @param petType 
 * @param name 
 * @param lives 
 */
@Serializable
@SerialName("cat")
data class Cat(

    @kotlinx.serialization.Transient override val petType: kotlin.String = "cat",

    @SerialName("name") override val name: kotlin.String,

    @SerialName("lives") val lives: kotlin.Int? = 9
) : Pet {

}

