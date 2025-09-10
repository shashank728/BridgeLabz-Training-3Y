package OOPS.Encapsulation;
class Student {
    private String studentName;
    private int studentRollNumber;
    private int studentAge;
    private String studentDepartment;

    public int getStudentRollNumber()
    {
        return studentRollNumber;
    }
    public void setStudentRollNumber(int studentRollNumber)
    {
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public int getStudentAge()
    {
        return studentAge;
    }
    public void setStudentAge(int studentAge)
    {
        this.studentAge = studentAge;
    }

    public String getStudentDepartment()
    {
        return studentDepartment;
    }
    public void setStudentDepartment(String studentDepartment)
    {
        this.studentDepartment = studentDepartment;
    }

    @Override
    public String toString()
    {
        return "Student Name: " + studentName + "\nStudent Roll Number: " + studentRollNumber + "\nStudent Age: "  + studentAge + "\nStudent Department: " + studentDepartment + "\n"; 
    }
}