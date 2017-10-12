package com_gmail_kr_malyar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Group{

    private Student[] group = new Student[10];
    private int quantityStudent = 0;

    public Group() {
        this.group = group;
        this.quantityStudent = quantityStudent;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public int getQuantityStudent() {
        return quantityStudent;
    }

    public void setQuantityStudent(int quantityStudent) {
        this.quantityStudent = quantityStudent;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + Arrays.toString(group) +
                '}';
    }

    public boolean equalsStudent(Object st) {

        for (int i=0;i<group.length;i++)
            if (group[i] == st) {
                return false;
            }
        return true;
    }


    public void addStudent(Student student) throws GroupIsOvercrowdedExeption {

        if (quantityStudent >= 10) {
            throw new GroupIsOvercrowdedExeption();
        }
        if (student == null) {
            throw new IllegalArgumentException("Student not created");
        }else {
            group[group.length -1]=student;
        }
        Arrays.sort(group, new SortedByName());
    }
    public void excludeStudent (Student student){
        for (int i=0;i<group.length;i++) {
            if (student.equals(group[i])){
                group[i]=null;
                System.out.println("Student is expelled");
            }

        }
          System.out.println("There is no such student in the group");
    }


}
