package com.example.babymonster;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UseService {
    private ArrayList<Animal> animals;

    public UseService(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(int id,String name){
        Animal a = new Animal(id,name);
        this.animals.add(a);
    }

    public String getAllAnimals(){
        return animals.toString();
    }

    public Animal getAnimalbyID(int id){
        for (Animal tmp : animals) {
            if (tmp.getId() == id) {
                return tmp;
            }
        }
        return null;
    }
    public void deleteAnimalbyID(int id){
        for (int i=0; i<animals.size();i++){
            Animal a = animals.get(i);
            if (a.getId()==id){
                animals.remove(i);
                return;
            }
        }
    }

    public void editAnimalbyID(int id,String name){
        for (Animal a : animals) {
            if (a.getId() == id) {
                a.setName(name);
                return;
            }
        }
    }
}
