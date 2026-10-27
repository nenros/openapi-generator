package org.openapitools.api

import org.openapitools.model.Thing
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ThingsApiTest {

    private val api: ThingsApiController = ThingsApiController()

    /**
     * To test ThingsApiController.echoThing
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun echoThingTest() {
        val thing: Thing = TODO()
        
        
        val response: ResponseEntity<Thing> = api.echoThing(thing)

        // TODO: test validations
    }
}
