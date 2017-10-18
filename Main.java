package com_gmail_kr_malyar;

public class Main {
    public static void main(String[] args) throws InteractivAddExeption {

        Group group = new Group();

        Student studentOne = new Student("Petrov","Vasya",
                18,"men",123,1,"Automobile");
        Student studentTwo = new Student("Ivanov","Vanya",
                17,"men",124,1,"Automobile");
        Student studentThree = new Student("Pyatochkin","Petrick",
                16,"men",125,1,"Automobile");
        Student studentFour = new Student("Pulemyotchitsa","Anka",
                19,"vomen",126,1,"Automobile");
        Student studentFive = new Student("Sidorov","Ivan",
                18,"men",127,1,"Automobile");
        Student studentSix = new Student("Popkin","Grigorii",
                17,"men",128,1,"Automobile");
        Student studentSeven = new Student("Chahlick","Nevmeruschii",
                80,"men",129,1,"Automobile");
        Student studentEight = new Student("Babka","Yogka",
                90,"vomen",130,1,"Automobile");
        Student studentNine = new Student("Tsarevich","Ivan",
                22,"men",132,1,"Automobile");
        Student studentTen = new Student("Prekrasnaya","ludmila",
                20,"vomen",133,1,"Automobile");

        Student studentEleven = new Student("Drovoseck","ivan",
                21,"men",134,1,"Automobile");

        try {
            group.addStudent(studentOne);
            group.addStudent(studentTwo);
            group.addStudent(studentThree);
            group.addStudent(studentFour);
            group.addStudent(studentFive);
            group.addStudent(studentSix);
            group.addStudent(studentSeven);
            group.addStudent(studentEight);
//            group.addStudent(studentNine);
//            group.addStudent(studentTen);


            group.sortingGroup();
            group.toString();

            group.searchStudent("Chahlick");
            group.searchStudent("Kalashnikov");

            group.addStudent(studentEleven);

            group.excludeStudent(studentFive);
            group.excludeStudent(studentSeven);

            group.sortingGroup();
            group.toString();

            group.militaryAge();
            group.addStudentInter();
        } catch (GroupIsOvercrowdedExeption groupIsOvercrowdedExeption) {
            groupIsOvercrowdedExeption.printStackTrace();
        }
       // Student []milStudent = new Student[];

    }
}
