public class Throw_Unchecked_Ex {
    static void validate (int n){
        if(n < 40){
            throw new ArithmeticException ("HUDAI");
        }
    }

    public static void main(String[] args) {
        try {
            validate(34);
            System.out.println("Hoy Nai");
        }

        catch (ArithmeticException e){
            System.out.println("Exception message : " + e);
        }

        finally {
            System.out.println("Last line");
        }
    }

}
