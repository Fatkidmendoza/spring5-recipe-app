package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.Recipe;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeServices;

    public IndexController(RecipeService recipeServices) {
        this.recipeServices = recipeServices;
    }


    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeServices.getRecipe());

        return "index";
    }
}
