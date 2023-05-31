package com.Gomes.ScreenMatch.Controller;

import com.Gomes.ScreenMatch.Domain.Movie.dadosRegisterMovie;
import com.Gomes.ScreenMatch.Models.Movies;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private List<Movies> movie = new ArrayList<>();
    @GetMapping("/form")
    public  String loadFormPage(){
        return "Movies/form";
    }
    @GetMapping
    public  String listMovies(Model model){
        model.addAttribute("list",movie);
        return "Movies/listMovies";
    }

    @PostMapping
    public String registerMovie (dadosRegisterMovie dados){
        var filme = new Movies(dados);
        movie.add(filme);
        System.out.println(movie);
        return "Movies/form";
    }
}
