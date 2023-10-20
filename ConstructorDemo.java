import java.util.Scanner;

class Paint
{
    int price=0;
    float price2=0.0f;
    String color="";
    Paint()
    {
        price=100;
        color="Black";
        System.out.println("Default Price:"+price);
        System.out.println("Default color:"+color);
    }
    Paint(int i,String s)
    {
        price=i;
        color=s;
        System.out.println("Default Price:"+price);
        System.out.println("Default color:"+color);
    }
    Paint(float i,String s)
    {
        price2=i;
        color=s;
        System.out.println("Default Price:"+price2);
        System.out.println("Default color:"+color);
    }
    Paint(Paint x)
    {
        color=x.color;
        price=x.price;
        //System.out.println("Default Price:"+price);
        //System.out.println("Default color:"+color);
        x.color="Lavendar";
        x.price=123;

    }
    Paint(Paint r,Paint g, Paint b,String c)
    {

        if(r.price>g.price && r.price> b.price)
        {
            price=r.price;
        }
        else if(g.price>b.price)
        {
            price=g.price;
        }
        else
        {
            price=b.price;

        }
        color=c;
    }



}

public class ConstructorDemo {
    public static void main(String[] args) {
        Paint p1=new Paint(); //Default Constructor
        Paint r=new Paint(2000,"Red");   //Parameterized Constructor
        Paint g=new Paint(4000,"Green"); //Parameterized Constructor
        Paint b=new Paint(5000,"Blue");  //Parameterized Constructor
        Paint p3=new Paint(3.14f,"Orange");
        Paint p4= new Paint(p1);               //Copy Constructor
        //System.out.println(p1.color+" "+p1.price);
        //System.out.println(p4.color+" "+p4.price);
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        Paint o=new Paint(r,g,b,s);
        System.out.println(o.color+" "+o.price);


    }
}
