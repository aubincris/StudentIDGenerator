package university;


public class Sophomore extends Student implements GenerateUSN{

    public static int id = 200;

    public Sophomore(String name, String level, String department,String yearOfEnrollement) {
        super(name, level, department, yearOfEnrollement);
        id++;
        USN = generateStudentUSN();
    }

    //Generate Student's Universal Serial Number(USN)
    @Override
    public String generateStudentUSN() {

        int number = (int)(Math.random() * Math.pow(10,3));
        String lastTwoDigitsOfYearOfEnrollement = yearOfEnrollement.substring(2);
        return usnInit + lastTwoDigitsOfYearOfEnrollement + department + id + number;

    }
}
