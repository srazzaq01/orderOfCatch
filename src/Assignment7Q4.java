import java.util.*;
public class Assignment7Q4 {
    public static void main(String[] args){
        //input stream
        Scanner input = new Scanner(System.in);

        //asking user to input the numerator and denominator
        System.out.println("enter the numerator");
        int num = input.nextInt();

        System.out.println("enter the denominator");
        int den = input.nextInt();

        //try block that throws exception if denominator == 0
        try{
            if (den == 0)
                throw new ArithmeticException("error: cannot divide by zero");
            System.out.println("the result of the division is: " + (num/den));
        }

        //catch block of superclass first, this will generate an error since this is the one
        //that will catch the ArithmeticException
        catch(Exception ex){
            System.out.println(ex);
        }

        //this catch block never reached because exception already caught in prior catch
        //block, so this demonstrates how the order is important for catch blocks
        catch (ArithmeticException AE){
            System.out.println(AE);
        }
    }
}
