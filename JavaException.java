public class JavaException{
    public static void main(String args[]){
        /*try{
            //code that may raise exception
            int data=10/0;
        }catch(ArithmeticException e){System.out.println(e);}


        String s=null;
        System.out.println(+ s.length());//NullPointerException

        //String s1="abc";
        //int i=Integer.parseInt(s1);//NumberFormatException
*/
        try
        {
            int a[]=new int[5];
            a[10]=50;
        }
        catch(ArrayIndexOutOfBoundsException  e){System.out.println("\n" + e);}         //ArrayIndexOutOfBoundsException
    }
}