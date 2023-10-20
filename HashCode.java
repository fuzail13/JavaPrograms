// Program Demonstrate hashcode() method of Method Class.

import java.lang.reflect.Method;

public class HashCode {

    // create a Method name getSampleMethod
    public void getSampleMethod1() {}

    // create main method
    public static void main(String args[])
    {

        try {

            // create class object for class name GFG
            Class c = HashCode.class;

            // get Method object of method name getSampleMethod
            Method method = c.getDeclaredMethod("getSampleMethod1", null);

            // get hashcode of method object using hashCode() method
            int hashCode = method.hashCode();

            // Print hashCode with method name
            System.out.println("hashCode of method " + method.getName()
                    + " is " + hashCode);
        }
        catch (Exception e) {
            // print if any exception occurs
            System.out.println(e.toString());
        }
    }
}
