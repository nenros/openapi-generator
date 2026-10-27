package org.openapitools

import kotlinx.serialization.json.Json
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.KotlinSerializationJsonHttpMessageConverter

/**
 * Makes Spring use kotlinx.serialization (instead of Jackson) for the `@Serializable` models.
 */
@Configuration
class KotlinxSerializationConfiguration {

    @Bean(name = ["org.openapitools.KotlinxSerializationConfiguration.kotlinxJson"])
    fun kotlinxJson(): Json = Json {
        // align with the defaults of the Jackson ObjectMapper configured by Spring Boot
        ignoreUnknownKeys = true
        encodeDefaults = true
    }

    @Bean(name = ["org.openapitools.KotlinxSerializationConfiguration.kotlinSerializationJsonHttpMessageConverter"])
    fun kotlinSerializationJsonHttpMessageConverter(json: Json): KotlinSerializationJsonHttpMessageConverter =
        KotlinSerializationJsonHttpMessageConverter(json)
}
