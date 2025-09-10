package Encapsulation;
class StudentService {
    private Student studentOne, studentTwo, studentThree, studentFour, studentFive, studentSix, studentSeven, studentEight, studentNine, studentTen;
    public void setStudentDetails()
    {
        studentOne = new Student();
        studentOne.setStudentRollNumber(41);
        studentOne.setStudentName("Kushaal");
        studentOne.setStudentAge(21);
        studentOne.setStudentDepartment("CSE");

        studentTwo = new Student();
        studentTwo.setStudentRollNumber(33);
        studentTwo.setStudentName("Krishna Kumar");
        studentTwo.setStudentAge(21);
        studentTwo.setStudentDepartment("CSE");

        studentThree = new Student();
        studentThree.setStudentRollNumber(34);
        studentThree.setStudentName("Krishna");
        studentThree.setStudentAge(21);
        studentThree.setStudentDepartment("CSE");

        studentFour = new Student();
        studentFour.setStudentRollNumber(39);
        studentFour.setStudentName("Kritika");
        studentFour.setStudentAge(21);
        studentFour.setStudentDepartment("CSE");

        studentFive = new Student();
        studentFive.setStudentRollNumber(22);
        studentFive.setStudentName("Garv");
        studentFive.setStudentAge(20);
        studentFive.setStudentDepartment("CSE");

        studentSix = new Student();
        studentSix.setStudentRollNumber(40);
        studentSix.setStudentName("Mahak");
        studentSix.setStudentAge(20);
        studentSix.setStudentDepartment("CSE");

        studentSeven = new Student();
        studentSeven.setStudentRollNumber(11);
        studentSeven.setStudentName("Bhavisya");
        studentSeven.setStudentAge(20);
        studentSeven.setStudentDepartment("CSE");

        studentEight = new Student();
        studentEight.setStudentRollNumber(43);
        studentEight.setStudentName("Mohit");
        studentEight.setStudentAge(20);
        studentEight.setStudentDepartment("CSE");

        studentNine = new Student();
        studentNine.setStudentRollNumber(37);
        studentNine.setStudentName("Krishnkant");
        studentNine.setStudentAge(20);
        studentNine.setStudentDepartment("CSE");

        studentTen = new Student();
        studentTen.setStudentRollNumber(35);
        studentTen.setStudentName("Kautuk");
        studentTen.setStudentAge(20);
        studentTen.setStudentDepartment("CSE");
    }

    public void displayStudentDetails()
    {
        System.out.println(studentOne.toString());
        System.out.println(studentTwo.toString());
        System.out.println(studentThree.toString());
    }   
    
}
