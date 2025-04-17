# Recipeplatform

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
    git clone <repository_url>
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

4. **Access the application**:
    The application will be running on `http://localhost:8080`.

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

| Datum | Uhrzeit von - Uhrzeit bis | Dauer in Minuten | Name | Arbeitbeschreibung |
|-------|---------------------------|------------------|------|--------------------|
|       |                           |                  | Olsi Mbrozi | Verantwortlich für das Erstellen und Strukturieren der Entitäten, DTOs und Tabellenstruktur der Datenbank |
|       |                           |                  | Franko Keci | Verantwortlich für die Implementierung der Service- und Controller-Klassen sowie die Logik zum Erstellen und Abrufen von Rezepten und Zutaten |
|       |                           |                  | Olsi Mbrozi | Entwurf und Implementierung der `Ingredient`, `Recipe` Entitäten und ihre Datenbankbeziehungen |
|       |                           |                  | Franko Keci | Entwicklung der API-Endpunkte in den Controllern und Business-Logik in den Services |
|       |                           |                  | Olsi Mbrozi | Erstellung und Pflege der DTOs für `IngredientResponse` und `RecipeResponse` |
|       |                           |                  | Franko Keci | Implementierung der Logik zur Verknüpfung von Rezepten mit Zutaten und deren Speicherung in der Datenbank |

## Contribution

If you would like to contribute to this project, feel free to open issues or submit pull requests. Please make sure to follow the guidelines for coding and documentation.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

