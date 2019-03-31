public class Throws_Checked {
    static void validate (int n) throws ClassNotFoundException{
        if(n < 40)
            throw new ClassNotFoundException ("Khusite");
    }

    public static void main(String[] args) {
        try{
            validate(34);
        }

        catch (ClassNotFoundException e){
            System.out.println("Exception message : " + e);
        }

        finally {
            System.out.println("Last line");
        }
    }
}
