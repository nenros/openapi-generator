package org.openapitools.api

import org.openapitools.model.Shape
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ShapesApiTest {

    private val api: ShapesApiController = ShapesApiController()

    /**
     * To test ShapesApiController.echoShape
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun echoShapeTest() {
        val shape: Shape = TODO()
        
        
        val response: ResponseEntity<List<Shape>> = api.echoShape(shape)

        // TODO: test validations
    }
}
