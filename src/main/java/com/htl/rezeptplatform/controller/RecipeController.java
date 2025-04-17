package com.htl.rezeptplatform.controller;


import com.htl.rezeptplatform.DTO.RecipeResponse;
import com.htl.rezeptplatform.entity.Recipe;
import com.htl.rezeptplatform.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    public final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public ResponseEntity<RecipeResponse> createRecipe(@RequestBody Recipe recipe){
        RecipeResponse recipe1 = recipeService.createRecipe(recipe);
        return ResponseEntity.ok().body(recipe1);
    }


    @GetMapping("/getAll")
    public List<RecipeResponse> getAllRecipes(){
        List<RecipeResponse> recipes = recipeService.returnRecipes();
        return recipes;
    }


}
