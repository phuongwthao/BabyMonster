package com.example.babymonster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BabyMonsterApplication {

    public static void main(String[] args) {

        SpringApplication.run(BabyMonsterApplication.class, args);
        Animal a = new Animal(1,"Thao");
        System.out.println(a);


    }

}
