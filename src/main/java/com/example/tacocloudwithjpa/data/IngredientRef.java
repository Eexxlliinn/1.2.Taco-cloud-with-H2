package com.example.tacocloudwithjpa.data;
import lombok.Data;
@Data
public class IngredientRef {
    private final String ingredient;
    private final Long taco_id;
}
