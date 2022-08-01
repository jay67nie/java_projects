public class Exc3 {
    public static void NotTired() throws ArithmeticException {
        int t = 40/0;
        throw new ArithmeticException("here");
    }

    public static void main(String[] args) {
        try {// monitor blocking of code.
            NotTired();
        } catch (ArithmeticException e) {
            //catch
            System.out.println("The value " + e);
            //e.printStackTrace();
        } finally {
            System.out.print("After catch statement.");
        }
    }
}