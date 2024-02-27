package org.example;

import java.util.Iterator;
import java.util.List;

public class PotokGroupIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> potokStudentGroupList;
    private int index;

    public PotokGroupIterator(PotokGroup potokGroup) {
        this.potokStudentGroupList = potokGroup.getPotokGroupList();
        index=0;
    }

    @Override
    public boolean hasNext() {
        return  (index<potokStudentGroupList.size());
    }

    @Override
    public StudentGroup next() {
        return hasNext()?potokStudentGroupList.get(index++):null;
    }

    @Override
    public void remove() {
        if(hasNext())
            potokStudentGroupList.remove(index);
    }
    public void begin(){
        index=0;
    }
}
