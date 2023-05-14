// 2. Если необходимо, исправьте данный код
// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }
 
 

public class hw_02_ex_p2 {

    private static int[] intArray;

    public static void main(String[] args) throws Exception {
        {
            try {
                int d = 0;

                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException | NullPointerException e) {
                System.out.println("Catching exception_: " + e);
            }
        }
    }
}