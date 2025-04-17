package com.htl.rezeptplatform.DTO;

import java.util.List;

public record RecipeResponse(
        Long id,
        String title,
        String description,
        String category,
        List<IngredientResponse> ingredients
) {

}
