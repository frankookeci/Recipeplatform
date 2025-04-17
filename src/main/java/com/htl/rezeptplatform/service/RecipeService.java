package com.htl.rezeptplatform.service;

import com.htl.rezeptplatform.DTO.Mapper.RecipeMapper;
import com.htl.rezeptplatform.DTO.RecipeResponse;
import com.htl.rezeptplatform.entity.Ingredient;
import com.htl.rezeptplatform.entity.Recipe;
import com.htl.rezeptplatform.repository.IngredientRepository;
import com.htl.rezeptplatform.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final IngredientRepository ingredientRepository;
    private final RecipeMapper recipeMapper;

    public RecipeService(RecipeRepository recipeRepository, IngredientRepository ingredientRepository, RecipeMapper recipeMapper) {
        this.recipeRepository = recipeRepository;
        this.ingredientRepository = ingredientRepository;
        this.recipeMapper = recipeMapper;
    }

    public RecipeResponse createRecipe(Recipe recipe) {
        List<Ingredient> ingredients = new ArrayList<>();
        for (Ingredient ingredient : recipe.getIngredients()) {
            Ingredient loadedIngredient = ingredientRepository.findById(ingredient.getId())
                    .orElseThrow(() -> new RuntimeException("Ingredient not found"));
            ingredients.add(loadedIngredient);
        }
        recipe.setIngredients(ingredients);

        Recipe savedRecipe = recipeRepository.save(recipe);
        return recipeMapper.toRecipeResponse(savedRecipe);
    }


    public List<RecipeResponse> returnRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        List<RecipeResponse> recipesResponse = recipeMapper.toRecipeResponseList(recipes);
        return recipesResponse;
    }
}
