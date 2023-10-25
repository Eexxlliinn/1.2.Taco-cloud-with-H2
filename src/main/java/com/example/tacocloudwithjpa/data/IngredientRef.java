package com.example.tacocloudwithjpa.data;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class IngredientRef {

    @NotNull
    private final String ingredient;

    @NotNull
    private final Long taco_id;
}
