package com.javadeveloperworld.validation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "username should not be null")
    private String name;

    @Email(message = "email should be valid")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number")
    private String mobile;

    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String nationality;
}
