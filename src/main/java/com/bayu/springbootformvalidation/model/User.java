package com.bayu.springbootformvalidation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;

    private boolean married;

    private Date birthday;
}
