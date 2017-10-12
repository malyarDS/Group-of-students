package com_gmail_kr_malyar;

public class Student extends Human{

    private int numberRecordBook;
    private int cours;
    private String faculty;

    public Student(String surname, String name, int age, String sex, int numberRecordBook, int cours, String faculty) {
        super(surname, name, age, sex);
        this.numberRecordBook = numberRecordBook;
        this.cours = cours;
        this.faculty = faculty;
    }

    public Student(int numberRecordBook, int cours, String faculty) {
        this.numberRecordBook = numberRecordBook;
        this.cours = cours;
        this.faculty = faculty;
    }

    public int getNumberRecordBook() {
        return numberRecordBook;
    }

    public void setNumberRecordBook(int numberRecordBook) {
        this.numberRecordBook = numberRecordBook;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Student{" +
                "numberRecordBook=" + numberRecordBook +
                ", cours=" + cours +
                ", faculty='" + faculty + '\'' +
                '}');
        return sb.toString();
    }

}
