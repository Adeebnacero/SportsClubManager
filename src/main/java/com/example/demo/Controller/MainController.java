package com.example.demo.Controller;

import com.example.demo.Domain.DatabaseTest;
import com.example.demo.Repository.DatabaseTestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Adeebo on 2017/08/15.
 */
@Controller
@RequestMapping
public class MainController {

    @Autowired
    private DatabaseTestRepo databaseTestRepo;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name){

        DatabaseTest dbTest = new DatabaseTest();

        dbTest.setName(name);

        databaseTestRepo.save(dbTest);
        return "Record Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<DatabaseTest> getAllUsers(){

        return databaseTestRepo.findAll();
    }
}
