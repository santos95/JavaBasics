package apicollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Peter Parker", 10));
        studentList.add(new Student("Peter Quil", 6));
        studentList.add(new Student("Matt Murdock", 9));
        studentList.add(new Student("Tony Stark", 10));

        System.out.println("loop for");
        for(Student student : studentList){
            System.out.println(student);
        }

        System.out.println("loop with for-i");
        for(int i = 0; i < studentList.size(); i++){
            Student student = studentList.get(i);
            System.out.println(student);
        }

        //loop with forEach
        System.out.println("loop with forEach");
        studentList.forEach(System.out::println);

        System.out.println("After sort");
//        Collections.sort(studentList);
        studentList.forEach(System.out::println);
    }


}
