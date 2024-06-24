package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.AppUser;
import com.example.demo.Repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        AppUser user = new AppUser();

        user.setName("Julio");
        user.setUsername("Julio123");
        user.setPassword("123");

        repository.save(user);

        for(AppUser u : repository.findAll()){
            System.out.println(u);
        }
    }

}
