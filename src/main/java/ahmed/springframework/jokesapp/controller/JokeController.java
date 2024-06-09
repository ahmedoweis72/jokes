package ahmed.springframework.jokesapp.controller;

import ahmed.springframework.jokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//thymleaf
@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", " "})
    public String ShowJokes(Model model) {
        model.addAttribute("jokes", jokeService.getJoke());
        return "index";

    }
}
