package net.gjore.jokes.controller;

import net.gjore.jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 08:56
 * Created in net.gjore.jokes.controller for jokes
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getRandomJoke());

        return "chucknorris";
    }
}
