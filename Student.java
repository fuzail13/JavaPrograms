import java.util.Scanner;

class School{
    String schoolname;
    School(String snm){
        this.schoolname = snm;
    }
    String getSchooolname(){
        return schoolname;
    }
}
public class Student extends School {
    int totalmarks;
    String name;
    Student(int tm, String nm, String snm){
        super(snm);
        this.totalmarks = tm;
        this.name = nm;
    }
    int getTotalmarks(){
        return totalmarks;
    }
    String getName(){
        return name;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student details you want to enter: ");
        int n = sc.nextInt();
        Student[] ob_ar = new Student[n];
        System.out.println("Enter the totalmarks, student name & school name: ");

        for(int i=0; i<n; i++){
            ob_ar[i] = new Student(sc.nextInt(),sc.next(),sc.next());
        }
        int highest = ob_ar[0].totalmarks;
        int s = 0;
        for(int i=1; i<ob_ar.length;i++){
            if (highest < ob_ar[i].totalmarks){
                highest = ob_ar[i].totalmarks;
                s = i;
            }

        }
        System.out.println("The highest marks of student is: "+ob_ar[s].getName()+" "+ob_ar[s].totalmarks);

    }
}

