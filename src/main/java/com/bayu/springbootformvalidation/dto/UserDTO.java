package com.bayu.springbootformvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @NotBlank(message = "Enter your email")
    @Email(message = "Enter a valid email address")
    private String email;

    @NotBlank(message = "Enter your password")
    @Length(min = 6, message = "Passwords must be at least 6 characters")
    private String password;

    @NotBlank(message = "Retype your password")
    private String retypePassword;

    @NotBlank(message = "Enter your First Name")
    private String firstName;

    @NotBlank(message = "Enter your Last Name")
    private String lastName;
}
