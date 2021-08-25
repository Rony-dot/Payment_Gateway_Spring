package com.rony.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User extends BaseModel{

    @NotNull(message = "name cannot be null")
//    @NotEmpty(message = "name cannot be empty")
    @Size(min = 4, max = 10, message
            = "Name must be between 4 and 10 characters")
    private  String name;

    public User() {
    }

    public User( String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        super.toString();
        return "User{" +
                ", name='" + name + '\'' +
                '}';
    }
}
