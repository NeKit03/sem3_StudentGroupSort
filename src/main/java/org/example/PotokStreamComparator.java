package org.example;

import java.util.Comparator;

public class PotokStreamComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        int resultOfComparing;
        resultOfComparing= o1.getSizeStudentList().compareTo(o2.getSizeStudentList());
        if (resultOfComparing == 0) {
            return resultOfComparing=o1.getNameGroup().compareTo(o2.getNameGroup());
        }else{
            return resultOfComparing;
        }

    }
}
