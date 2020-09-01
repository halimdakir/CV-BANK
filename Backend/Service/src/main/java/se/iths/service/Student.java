package se.iths.service;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id @GeneratedValue Integer id;
    String firstName;
    String lastName;
    String education;


    public Student(Integer id, String firstName,String lastName, String education) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.education=education;
    }
}

