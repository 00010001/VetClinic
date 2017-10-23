package pl.sdacademy.vetclinic.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.vetclinic.model.Pet;
import pl.sdacademy.vetclinic.repository.PetRepository;

import java.util.List;

@RestController
public class PetController {

    private PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @RequestMapping(
            value = "/pets",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Pet> getAllPets() {
        return petRepository.getAll();
    }
}
