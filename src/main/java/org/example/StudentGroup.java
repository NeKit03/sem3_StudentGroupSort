package org.example;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup> {
    private List<Student> studentList;
    private String nameGroup;


    @Override
    public String toString() {
        return "nameGroup="+
                nameGroup+"\n" + studentList ;
    }

    public StudentGroup(List<Student> studentList,String name) {
        this.studentList = studentList;
        this.nameGroup=name;

    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getNameGroup() {
        return nameGroup;
    }
    public Integer getSizeStudentList(){
        return studentList.size();
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);

    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if(getSizeStudentList() > o.getSizeStudentList())
            return 1;
        if(getSizeStudentList() > o.getSizeStudentList())
            return -1;
        return 0;
    }
}