public class Exception_Handling {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try{
            int c = x/y;
            System.out.println("Value of c : " + c);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception message : " + e);
        }

        catch (ArithmeticException e1){
            System.out.println("Exception message : " + e1);
        }
        finally{
            System.out.println("This is the last line of program");
        }
    }


}
