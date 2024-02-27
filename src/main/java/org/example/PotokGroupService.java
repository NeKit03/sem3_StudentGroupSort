package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PotokGroupService {
    private PotokGroup potokGroup;

    public PotokGroupService(PotokGroup potokGroup) {
        this.potokGroup = potokGroup;
    }

    public PotokGroup getPotokGroup() {
        return potokGroup;
    }
    public List<StudentGroup> getSortedGroup(){
        List<StudentGroup> groupList=new ArrayList<>(potokGroup.getPotokGroupList());
        Collections.sort(groupList);
        return groupList;
    }

    public List<StudentGroup> getSortedGroupBySizeStudentList(){
        List<StudentGroup> groupList = new ArrayList<>(potokGroup.getPotokGroupList());
        groupList.sort(new PotokStreamComparator());
        return groupList;
    }
}
