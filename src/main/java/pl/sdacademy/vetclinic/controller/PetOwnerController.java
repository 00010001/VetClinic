package pl.sdacademy.vetclinic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.vetclinic.model.Pet;
import pl.sdacademy.vetclinic.model.PetOwner;
import pl.sdacademy.vetclinic.repository.PetOwnerRepository;
import pl.sdacademy.vetclinic.repository.PetRepository;

import javax.validation.Valid;
import java.util.List;
@RequestMapping(
        value = "/petOwners",
        produces = MediaType.APPLICATION_JSON_VALUE
)
@RestController
public class PetOwnerController {

    private PetOwnerRepository petOwnerRepository;

    public PetOwnerController(PetOwnerRepository petOwnerRepository) {
        this.petOwnerRepository = petOwnerRepository;
    }

    @RequestMapping(
          //  value = "abc",
            method = RequestMethod.GET
    )
    public List<PetOwner> getAllPetOwners() {
        return petOwnerRepository.getAll();
    }
    @RequestMapping(
            //  value = "abc",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    public PetOwner add(@RequestBody @Valid PetOwner petOwner){
        petOwner.setId((int)(petOwnerRepository.count()+1));
        petOwnerRepository.add(petOwner);
        return petOwner;
    }


    @RequestMapping(
            value="/{ownerId}",
            method = RequestMethod.GET
    )
    public PetOwner get(@PathVariable("ownerId") Integer ownerId){
        return petOwnerRepository.getById(ownerId);
    }
}
