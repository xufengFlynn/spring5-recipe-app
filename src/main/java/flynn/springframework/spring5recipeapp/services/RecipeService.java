package flynn.springframework.spring5recipeapp.services;

import flynn.springframework.spring5recipeapp.commands.RecipeCommand;
import flynn.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
