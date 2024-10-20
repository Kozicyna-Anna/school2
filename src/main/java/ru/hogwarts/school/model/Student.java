package ru.hogwarts.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int age;
}
