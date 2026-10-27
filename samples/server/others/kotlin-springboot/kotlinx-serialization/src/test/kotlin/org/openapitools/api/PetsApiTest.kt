package org.openapitools.api

import org.openapitools.model.Pet
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class PetsApiTest {

    private val api: PetsApiController = PetsApiController()

    /**
     * To test PetsApiController.createPet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createPetTest() {
        val pet: Pet = TODO()
        
        
        val response: ResponseEntity<Pet> = api.createPet(pet)

        // TODO: test validations
    }
}
