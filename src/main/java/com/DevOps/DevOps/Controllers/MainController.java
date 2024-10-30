package com.DevOps.DevOps.Controllers;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/")
    public String main(){
        return "<h1><b>Application working...<b></h1>";
    }
}
