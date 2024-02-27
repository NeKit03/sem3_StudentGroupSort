package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aAb", "aAb", "aAb");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList,"001");
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }


        Student student5 = new Student(1, "aAb", "aAb", "aAb");
        Student student6 = new Student(2, "aaa", "aaa", "aaa");
        List<Student> studentList1 = new ArrayList<>();
        StudentGroup studentGroup1 = new StudentGroup(studentList1,"007");
        studentGroup1.addStudent(student5);
        studentGroup1.addStudent(student6);

        Student student7 = new Student(1, "aAb", "aAb", "aAb");
        Student student8 = new Student(2, "aaa", "aaa", "aaa");
        List<Student> studentList2 = new ArrayList<>();
        StudentGroup studentGroup2 = new StudentGroup(studentList2,"003");
        studentGroup2.addStudent(student7);
        studentGroup2.addStudent(student8);

//////////////////////////Создание групп студентов///////////////////////////////////////////////////
        List<StudentGroup> potok=new ArrayList<>();
        PotokGroup potok1=new PotokGroup(potok,"Matematicks");
        potok1.addGroup(studentGroup);
        potok1.addGroup(studentGroup1);
        potok1.addGroup(studentGroup2);
        PotokGroupIterator iteratorPotok = new PotokGroupIterator(potok1);
        System.out.println("До сортировки");
        while(iteratorPotok.hasNext()) {
            System.out.println(iteratorPotok.next());
        }
        System.out.println("После сортировки");
        PotokGroupService potokService =new PotokGroupService(potok1);
        for (StudentGroup group : potokService.getSortedGroupBySizeStudentList() ) {
            System.out.println(group);
        }
       /* System.out.println();
        StudentGroupIterator iterator2 = new StudentGroupIterator(potokService.getSortedGroupBySizeStudentList());
        while(iteratorPotok.hasNext()) {
            System.out.println(iteratorPotok.next());
        }*/


    }
}