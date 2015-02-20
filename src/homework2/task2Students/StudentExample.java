package homework2.task2Students;

import java.time.LocalDate;

/**
 * Created by ira on 19.02.15.
 */
public class StudentExample {
    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.add(new Student("Dima", "Stepurenko", LocalDate.of(1986, 1,1 )));
        sl.add(new Student("Vasya", "Pupkin", LocalDate.of(1970, 3, 28)));
        sl.add(new Student("Vasya", "Pupkin", null));

        Student n = sl.findByName("Vasya");
        System.out.println(n.toString());
    }
}
