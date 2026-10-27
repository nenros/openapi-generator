package org.openapitools.api

import org.openapitools.model.Thing
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class ThingsApiController() {


    @RequestMapping(
        method = [RequestMethod.POST],
        // "/things"
        value = [PATH_ECHO_THING],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun echoThing(
        @Valid @RequestBody thing: Thing
    ): ResponseEntity<Thing> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_ECHO_THING: String = "/things"
    }
}
