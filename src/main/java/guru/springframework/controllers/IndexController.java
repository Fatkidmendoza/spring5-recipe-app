package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.Recipe;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeServices;

    public IndexController(RecipeService recipeServices) {
        this.recipeServices = recipeServices;
    }


    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        log.debug("Iside the Recipes page. Before calling recipes");
        model.addAttribute("recipes", recipeServices.getRecipe());
        log.debug("Iside the Recipes page. After calling recipes");

        return "index";
    }
}
