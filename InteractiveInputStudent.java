package com_gmail_kr_malyar;

import javax.swing.*;

public class InteractiveInputStudent {

    public InteractiveInputStudent() {
    }

/*Если проверять на валидность введенных данных получается намного
 больше 30 строчек.Или это кислая отмазка?
  */
    public Student getStudent() throws InteractivAddExeption {

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

        Student intStudent =new Student(surname, name, age, sex, numberRecordBook, cours, faculty);


        return intStudent ;

    }
}
