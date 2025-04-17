package com.htl.rezeptplatform.DTO.Mapper;

import com.htl.rezeptplatform.DTO.IngredientResponse;
import com.htl.rezeptplatform.DTO.RecipeResponse;
import com.htl.rezeptplatform.entity.Ingredient;
import com.htl.rezeptplatform.entity.Recipe;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecipeMapper {
    private final IngredientMapper ingredientMapper;

    public RecipeMapper(IngredientMapper ingredientMapper) {
        this.ingredientMapper = ingredientMapper;
    }

    public RecipeResponse toRecipeResponse(Recipe recipe) {
        return new RecipeResponse(
                recipe.getId(),
                recipe.getTitle(),
                recipe.getDescription(),
                recipe.getCategory(),
                ingredientMapper.toIngredientResponseList(recipe.getIngredients())
        );
    }

    public List<RecipeResponse> toRecipeResponseList(List<Recipe> recipes) {
        return recipes.stream()
                .map(this::toRecipeResponse)
                .collect(Collectors.toList());
    }
}
