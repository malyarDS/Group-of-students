package com_gmail_kr_malyar;

import javax.swing.*;
import java.util.Arrays;

public class Group implements Voencom {

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
        sortingGroup();
        System.out.println("Group list");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < quantityStudent; i++) {
            sb.append(group[i].getSurname() + " " +
                    "");
        }
        return sb.toString();
    }

    public boolean equalsStudent(Object st) {

        for (int i = 0; i < group.length; i++)
            if (group[i] == st) {
                return false;
            }
        return true;
    }


    public void addStudent(Student student) throws GroupIsOvercrowdedExeption {
        if (quantityStudent < 10) {
            if (student == null) {
                throw new IllegalArgumentException("Student not created");
            } else {
                group[quantityStudent] = student;
                quantityStudent++;
            }
        } else {
            throw new GroupIsOvercrowdedExeption();

        }
    }

    public void excludeStudent(Student student) {
        for (int i = 0; i < group.length; i++) {
            if (student.equals(group[i])) {
                group[i] = null;
                quantityStudent--;
                System.out.println("Student is expelled");
            }
        }
        System.out.println("There is no such student in the group");
    }


    public Student[] sortingGroup() {
        for (int i = 0; i < quantityStudent - 1
                && i + 1 < quantityStudent; i++) {
            String sur1 = group[i].getSurname();
            String sur2 = group[i++].getSurname();
            if (sur1.compareTo(sur2) < 0) {
                Student temp = group[i];
                group[i] = group[i++];
                group[i++] = temp;
            }
        }
        return group;
    }

    public Student searchStudent(String surName) {
        for (int i = 0; i < quantityStudent; i++) {
            if (group[i] != null &&
                    group[i].getSurname() == surName) {
                System.out.println("Seeking student № " + (i + 1) + " " + group[i]);
                return group[i];
            }
        }
        System.out.println(surName + "there isn't group");
        return null;
    }

    @Override
    public Student[] militaryAge() {
        Student[] milAge = new Student[1];
        Student[] temp = new Student[1];
        Student[] temp2 = new Student[1];
        Student[] potentialConscript = new Student[1];
        int quantityPotentialConscript = 0;
        int quantityMilitary = 0;
        for (int i = 0; i < quantityStudent - 1; i++) {
            System.out.println("\n" +
                    "These students must undergo a " +
                    "medical commission");
            if (group[i] != null && group[i].getAge() > 16 &&
                    group[i].getSex().equals("men")) {
                potentialConscript[quantityMilitary] = group[i];
                System.out.println(group[i]);
                quantityPotentialConscript++;
                System.arraycopy(potentialConscript
                        , 0, temp2, 0, quantityPotentialConscript);
                potentialConscript = temp2;
            }
            return potentialConscript;
        }
        for (int i = 0; i < quantityStudent - 1; i++) {
            if (group[i] != null && group[i].getAge() > 17 &&
                    group[i].getAge() < 27 &&
                    group[i].getSex().equals("men")) {
                milAge[quantityMilitary] = group[i];
                quantityMilitary++;
                System.arraycopy(milAge, 0, temp, 0, quantityMilitary);
                milAge = temp;
            }
        }
        System.out.println("These students age of conscription");
        System.out.println(milAge);
        return milAge;
    }

    public void interactivAddStudent() throws InteractivAddExeption, GroupIsOvercrowdedExeption {
        String surname = JOptionPane.showInputDialog("What is student name?");

        String name = JOptionPane.showInputDialog("What is student name?");

        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);

        String sex = JOptionPane.showInputDialog("What is student sex : men or woman?");

        String input2 = JOptionPane.showInputDialog("What is student number record book?");
        int numberRecordBook = Integer.parseInt(input2);

        String input3 = JOptionPane.showInputDialog("What is student cours?");
        int cours = Integer.parseInt(input3);

        String faculty = JOptionPane.showInputDialog("What is faculty?");

        Student interSyudent = new Student(surname, name, age, sex, numberRecordBook, cours, faculty);
        this.addStudent(interSyudent);
        System.out.println(Arrays.toString(group));
        return;
    }
}

