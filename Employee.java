package YuvanJava;
import java.util.Scanner;
class EmployInfo{
    private int employid;
    private String name;
    private float BasicSalary;
    private float Allow1;
    private float Allow2;
    private float pro_tax;
    private float insurance;
    private float saving;
    EmployInfo(int employid, String name, float BasicSalary, float Allow1, float Allow2, float pro_tax, float insurance, float saving){
        this.employid = employid;
        this.name=name;
        this.BasicSalary=BasicSalary;
        this.Allow1=Allow1;
        this.Allow2=Allow2;
        this.pro_tax=pro_tax;
        this.insurance=insurance;
        this.saving=saving;
    }
    void Display(){
        System.out.println(employid+" "+name+" "+BasicSalary+" "+Allow1+" "+Allow2+" "+pro_tax+" "+insurance+" "+saving);
    }
    float getbasic(){
        return BasicSalary;
    }
    float geta1(){
        return Allow1;
    }
    float geta2(){
        return Allow2;
    }
    float getpro(){
        return pro_tax;
    }
    float getinsure(){
        return insurance;
    }
    float getsave(){
        return saving;
    }
}
public class Employee{
    public static void main(String[] args){
        EmployInfo e1 = new EmployInfo(1132, "Yuvan", 2000, 150, 100, 50, 2, 2000);
        EmployInfo e2 = new EmployInfo(1159, "Dhyan", 3000, 200, 75, 30, 5, 2500);
        EmployInfo e3 = new EmployInfo(1186, "Eddie", 2500, 175, 150, 60, 10, 5000);
        e1.Display();
        System.out.println(Salary(e1));
        e2.Display();
        System.out.println(Salary(e2));
        e3.Display();
        System.out.println(Salary(e3));
    }
    static float Salary(EmployInfo e1){
        return (e1.getbasic()+e1.geta1()+e1.geta2()-e1.getpro()-e1.getinsure()-e1.getsave());
    }
}