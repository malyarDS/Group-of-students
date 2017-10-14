package com_gmail_kr_malyar;

import java.util.Comparator;

public class SortedByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

//        String str1 = o1.getSurname();
//        String str2 = o2.getSurname();

        return o2.getSurname().compareTo(o1.getSurname());
    }
}
