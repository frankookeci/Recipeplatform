
# Rezeptplatform Project

## Project Description

The **Rezeptplatform** is a web-based application developed using Spring Boot. The platform allows users to manage recipes, including ingredients and categories. It supports operations such as creating, retrieving, and displaying recipes with their corresponding ingredients.

The project is divided into multiple layers, including **DTO**, **controller**, **entity**, **repository**, and **service**. Each layer plays a specific role in maintaining a clean and modular architecture.

### Key Features:
- **Recipe Management**: Users can create and view recipes with titles, descriptions, and categories.
- **Ingredient Management**: Users can create and manage ingredients for each recipe.
- **Many-to-Many Relationship**: Recipes can have multiple ingredients, and ingredients can belong to multiple recipes.
- **DTO Mapping**: Data Transfer Objects (DTOs) are used for clean communication between the backend and frontend, using mappers to convert between entities and responses.

## Folder Structure

- **DTO**: Contains Data Transfer Objects (DTOs) for communication.
- **Controller**: Handles HTTP requests and responses.
- **Entity**: Represents the domain objects for the application.
- **Repository**: Interfaces for database interactions.
- **Service**: Contains the business logic of the application.

## Installation Instructions

To run the **Rezeptplatform** locally, follow these steps:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/frankookeci/Recipeplatform.git
    cd rezeptplatform
    ```

2. **Install dependencies**:
    Ensure you have JDK 11 or higher installed, and Maven is set up to handle project dependencies.
    ```bash
    mvn clean install
    ```

3. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```



## Project Structure

### DTO
- **IngredientResponse.java** and **RecipeResponse.java** represent the responses sent to the client.
- **IngredientMapper.java** and **RecipeMapper.java** handle the transformation of entities to DTOs.

### Controller
- **IngredientController.java** and **RecipeController.java** expose endpoints to interact with ingredients and recipes.

### Entity
- **Ingredient.java** and **Recipe.java** represent the domain models in the application.
- **User.java** represents the user entity (for future authentication and authorization).

### Repository
- **IngredientRepository.java** and **RecipeRepository.java** interact with the database for CRUD operations on ingredients and recipes.

### Service
- **IngredientService.java** and **RecipeService.java** contain the business logic to manage ingredients and recipes.

## Work Breakdown

Below is a detailed log of the work done by each team member in the project.

| Date       | Time from - Time until | Duration in minutes | Name         |  Work description                                                                 |
|-------------|---------------------------|------------------|--------------|-------------------------------------------------------------------------------------|
| 10.04.2025  | 17:00 - 17:45              | 45               | Olsi Mbrozi  | Design and implementation of the `Ingredient` and `Recipe` entities               |
| 11.04.2025  | 18:30 - 19:15              | 45               | Olsi Mbrozi  | Creation of the table structure and many-to-many relationships between recipes and ingredients |
| 12.04.2025  | 18:00 - 18:30              | 30               | Olsi Mbrozi  | Creation of the `IngredientResponse` and `RecipeResponse` DTO classes            |
| 13.04.2025  | 19:00 - 19:45              | 45               | Franko Keci  | Development of the service classes for `Ingredient` and `Recipe |
| 14.04.2025  | 20:00 - 20:45              | 45               | Franko Keci  | Implementation of the REST endpoints in `IngredientController` and `RecipeController` |
| 15.04.2025  | 20:30 - 21:00              | 30               | Olsi Mbrozi  | Development of the mapper classes for DTO transformation                              |
| 16.04.2025  | 19:00 - 19:45              | 45               | Franko Keci  | Logic for linking recipes with ingredients and storing them in the database |
| 17.04.2025  | 17:00 - 17:30              | 30               | Franko Keci  | Test and debug recipe creation with existing ingredients                 |

