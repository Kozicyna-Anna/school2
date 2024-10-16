package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repository.StudentRepository;


@Service
@RequiredArgsConstructor
public class StudentService implements StudentService {

    private final StudentRepository studentRepository;


    public Student addStudent(Student student) {
        student.setId(count++);
        students.put(student.getId(), student);
        return student;
    }

    public Student findStudent(long id) {
        return students.get(id);
    }
    public Student editStudent(Student student) {
        if (!students.containsKey(student.getId())) {
            return null;
        }
        students.put(id, student);
        return student;
    }

    public void  deleteStudent(long id) {
        students.remove(id);
    }
}
