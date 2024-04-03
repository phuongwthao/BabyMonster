package com.example.babymonster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UseController {
    @Autowired
    private UseService service;

    @GetMapping("/")
    public String getall(){
        return  service.getAllAnimals();
    }

    @GetMapping("/{id}")
    public Animal getanimal(@PathVariable(value = "id") int id){
        return service.getAnimalbyID(id);

    }

    @PostMapping("/post")
    public void addAnimal(@RequestBody Animal a){
        service.addAnimal(a.getId(),a.getName());
    }

    @PutMapping("/{id}")
    public void editAnimal(@PathVariable(value="id") int id,@RequestParam(value = "name") String name){
        service.editAnimalbyID(id,name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimal(@PathVariable(value = "id")int id){
        service.deleteAnimalbyID(id);
    }

}
