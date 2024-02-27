package org.example;

import java.util.Iterator;
import java.util.List;

public class PotokGroup implements Iterable<StudentGroup> {
    private List<StudentGroup> potokGroup;
    private String namePotok;

    @Override
    public String toString() {
        return "PotokGroup{" +"namePotok='" + namePotok +
                 potokGroup +
                 '\'' +
                '}';
    }

    public PotokGroup(List<StudentGroup> potokGroup, String name) {
        this.potokGroup = potokGroup;
        this.namePotok=name;
    }

    public List<StudentGroup> getPotokGroupList() {
        return potokGroup;
    }
    public void addGroup(StudentGroup studentGroup){
        potokGroup.add(studentGroup);
    }

    public void setPotokGroup(List<StudentGroup> potokGroup) {
        this.potokGroup = potokGroup;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new PotokGroupIterator(this);
    }
}
