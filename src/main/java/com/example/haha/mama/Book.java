package com.example.haha.mama;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book extends Shop{

    @GetMapping("/books")
    public String foo() {
        return "ffffF";
    }

}
