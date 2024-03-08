package com.prueba.crud.controller;

import com.prueba.crud.model.Persona;
import com.prueba.crud.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    @PostMapping("/nuevo")
    public Persona newPersona(@RequestBody Persona newPersona){
        return this.personaService.newPerson(newPersona);
    }
    @GetMapping("/mostrar")
    public Iterable<Persona> getAll(){
        return personaService.getAll();
    }
    @PostMapping("/update")
    public Persona updatePerson(Persona persona){
        return this.personaService.modifyPerson(persona);
    }
    @PostMapping("/{id}")
    public Boolean deletePerson(@PathVariable(value = "id") Long id){
        return this.personaService.deletePerson(id);
    }


}

