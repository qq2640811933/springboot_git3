package com.emtor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContoller {

    @GetMapping("/index")
    public  String index(){
        return "heolsad";
    }
}
