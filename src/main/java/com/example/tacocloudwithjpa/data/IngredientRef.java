package com.example.tacocloudwithjpa.data;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class IngredientRef {

    @NotNull
    private final Long taco_id;

    @NotNull
    private final String ingredient;


}
