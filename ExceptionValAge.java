// class representing custom exception
class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class ExceptionValAge
{
    // method to check the age
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){

            // throw an object of user defined exception
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("\nYour age- "+ age +" hence welcome to vote!! ");
        }
    }
    static void validate1 (int age) throws InvalidAgeException{
        if(age < 18){

            // throw an object of user defined exception
            throw new InvalidAgeException("\nYour age "+ age +" is not valid to vote");
        }
        else {
            System.out.println("\nYour age- "+ age +" hence welcome to vote!! ");
        }
    }

    // main method
    public static void main(String args[])
    {
        try
        {
            // calling the method
            validate(30);
            validate1(12);
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("\nCaught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

    }
}