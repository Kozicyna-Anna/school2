package ru.hogwarts.school.model;

import jakarta.persistence.Entity;

import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Student {

    private long id;
    private String name;
    private int age;
}
