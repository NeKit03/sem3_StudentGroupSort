package org.example;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
     private int index;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        index=0;
    }

    @Override
    public boolean hasNext() {
        return (index<studentList.size());
    }

    @Override
    public Student next() {
        return hasNext()?studentList.get(index++):null;
    }

    @Override
    public void remove() {
        if(hasNext())
            studentList.remove(index);
    }

    public void begin(){
        index=0;
    }
}
