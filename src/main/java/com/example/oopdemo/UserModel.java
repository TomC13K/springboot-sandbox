package com.example.oopdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

// use validator https://www.baeldung.com/spring-service-layer-validation
// lombok creates getter, setter, hash ...
@Data
@AllArgsConstructor
public class UserModel {
    @NotNull(message = "Password must be between 4 to 15 characters")
    public String name;

    @NotNull
    @NotBlank(message = "Name must not be blank")
    public String surname;

    @NotNull
    @Min(value = 1, message = "Age should not be less than 1")
    @Max(value = 100, message = "Age should not be more than 100")
    public Integer age;

    public int age2;
}
