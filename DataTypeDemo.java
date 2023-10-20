//Write a Program to find a square in float.

public class DataTypeDemo {
    public static void main(String[] args) {
        //By default, The decimal value will always be double, we're converting into float by using f or F.
        float x= decimal(3.14f);

        System.out.println(x);

    }
    //Catching Parameter should have the same datatype, The type of value we're passing while calling the function.
    static float decimal(float e)

    {
        return e*e;
    }
}