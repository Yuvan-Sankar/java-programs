package YuvanJava;
import java.util.Scanner;
class WorkerInfo{
    private int employid;
    private String name;
    private float BasicSalary;
    private float Allow1;
    private float Allow2;
    private float pro_tax;
    private float insurance;
    private float saving;
    WorkerInfo(int employid, String name, float BasicSalary, float Allow1, float Allow2, float pro_tax, float insurance, float saving){
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
        System.out.println(employid+" "+name+" "+BasicSalary+" "+Allow1+" "+Allow2+" "+pro_tax+" "+insurance+" "+saving + " " + getsal());

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
    float getsal(){
        float salary = BasicSalary + Allow1 + Allow2 + pro_tax + insurance + saving;
        return salary;
    }
}
public class Worker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //WorkerInfo e1 = new WorkerInfo(1132, "Yuvan", 2000, 150, 100, 50, 2, 2000);
        WorkerInfo w[] = new WorkerInfo[3];
        for (int i=0; i<3; i++){
            System.out.println("enter the employid, name, and the basic salary");
            w[i]= new WorkerInfo(sc.nextInt(), sc.next(), sc.nextInt(), 150, 100, 50, 2, 2000);
        }
        System.out.println("Details of the worker: ");
        for(int i=0; i<w.length; i++){
            w[i].Display();
        }
        Highest(w);
    sc.close();
    }
    static void Highest(WorkerInfo w[]){
        float highest = 0.0f;
        int number = 0;
        for(int i = 0; i<w.length; i++){
            if (w[i].getsal()>highest){
                highest =w[i].getsal();
                number = i;
            }
        }
        System.out.println("the person with the largest salary has a salary of "+ highest + " and their information is the following: " );
        w[number].Display();
    }
}