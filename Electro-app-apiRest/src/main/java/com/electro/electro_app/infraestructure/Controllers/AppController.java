package com.electro.electro_app.infraestructure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

      @GetMapping("/app")
    public String index( ) {
        int valor=100/0;
        return "Ok 200"+ valor;
    }

}
