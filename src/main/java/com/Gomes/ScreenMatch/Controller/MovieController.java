package com.Gomes.ScreenMatch.Controller;

import com.Gomes.ScreenMatch.Domain.Movie.dadosRegisterMovie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public  String loadFormPage(){
        return "Movies/form";
    }

    @PostMapping
    public String registerMovie (dadosRegisterMovie dados){
        System.out.println(dados);
        return "Movies/form";
    }
}
