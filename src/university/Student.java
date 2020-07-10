package university;

public class Student {

    private String name;
    private String level;
    protected String department;
    private int contactNumber;
    protected String yearOfEnrollement;
    protected String USN;
    protected String usnInit = "1EP";

    public Student(String name, String level, String department, String yearOfEnrollement) {
        this.name = name;
        this.level = level;
        this.department = department;
        this.yearOfEnrollement = yearOfEnrollement;
    }

    //Display Student Information
    public void showInfo(){
        System.out.println(
                "\nName: " + name +
                        "\nLevel: " + level +
                        "\nDepartment: " + department +
                        "\nYear of Enrollement: " + yearOfEnrollement +
                        "\nUSN: " + USN);
    }
}


