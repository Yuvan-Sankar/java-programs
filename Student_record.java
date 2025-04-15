package YuvanJava;
import java.util.Scanner;
class Student{
    private int id;
    private String name;
    private int grade;
    private String DOA;
    private float percent;
    Student(){
        id = 0;
        name ="";
        grade = 0;
        DOA = "";
        percent = 0;
    }
    Student(int a, String b, int c, String d, float e){
        id = a;
        name = b;
        grade = c;
        DOA = d;
        percent = e;
    }
    void Display(){
        System.out.println(id + "\t"+ name+ "\t"+ grade+ "\t"+DOA+ "\t"+percent);
    }
    float getpercent(){
        return percent;
    }
    
}
public class Student_record{
    public static void main(String args[]){
        Student s1 = new Student(1159, "Yuvan", 9, "09/06/2024", 100);
        Student s2 = new Student(1121, "Adam", 12, "09/03/2021", 96.48f);
        Student s3 = new Student(1282, "Ravi", 10, "09/04/2023", 89.92f);
        s1.Display();
        s2.Display();
        s3.Display();
        Highest(s1, s2, s3);
    }
    static void Highest(Student s1, Student s2, Student s3){
        if (s1.getpercent()>s2.getpercent() && s1.getpercent()>s3.getpercent()){
            s1.Display();
        }
        else if (s2.getpercent()<s3.getpercent()){
            s3.Display();
        }
        else{
            s2.Display();
        }
    }
}