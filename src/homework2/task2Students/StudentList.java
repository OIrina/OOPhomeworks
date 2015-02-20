package homework2.task2Students;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by ira on 19.02.15.
 */
public class StudentList {
    private Student[] list = new Student[100];
    private int p = 0;

    public void add(Student s) {
        ++p;
        if (p > list.length)
            listExtension();
        list[p] = s;
    }

    public Student get(int n) {
        return list[n];
    }

    public void delete(Student s) {
        list[p--] = s;
    }

    public Student findByName(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return list[i];
        }

        return null;
    }

    public Student findBySurname(String surname) {
        for (int i = 0; i < p; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname))
                return list[i];
        }

        return null;
    }

    public Student findByDateOfBirth(LocalDate birth) {
        for (int i = 0; i < p; i++) {
            if (list[i].getBirth().equals(birth))
                return list[i];
        }

        return null;
    }

    private void listExtension(){
        list = Arrays.copyOf(list, list.length * 2);
    }
}
