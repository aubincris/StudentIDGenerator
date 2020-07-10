package university;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIDGenApp {

    public static void main(String[] args) {

        //List containing the CSV file
        List<String[]> valueList = new ArrayList<>();

        //List containing each student info
        List<Student> studentList = new ArrayList<>();

        //File newFile = new File("E:\\Files\\original.csv");
        String file = "E:\\Files\\original.csv";
        String values;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((values = br.readLine()) != null) {
                String[] records = values.split(",");
                valueList.add(records);

            }

        }catch (FileNotFoundException e){
            System.out.println("File Not found");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("COULD NOT READ FOUND");
            e.printStackTrace();
        }

        for (String[] a : valueList){
            String name = a[0];
            String Level = a[1];
            String department = a[2];
            String contactNum = a[3];
            String YOE = a[4];

            if (Level.equals("Fresher")){
                studentList.add(new Fresher(name,Level,department,YOE));
            }else if (Level.equals("Sophomore")){
                studentList.add(new Sophomore(name, Level, department, YOE));
            }else if (Level.equals("Junior")){
                studentList.add(new Junior(name, Level, department, YOE));
            }else if (Level.equals("Senior")){
                studentList.add(new Senior(name, Level, department, YOE));
            }else{
                System.out.println("Please Ensure the level is from fresher to senior");
            }
        }

        for (Student student : studentList){
            student.showInfo();
            System.out.println("******************");
        }



    }
}

