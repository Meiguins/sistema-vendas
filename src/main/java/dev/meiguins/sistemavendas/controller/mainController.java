package dev.meiguins.sistemavendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class mainController {
    
    @GetMapping("/administrativo")
    public String acessarPrincipal() {
        return "administrativo/home";
    }
}
