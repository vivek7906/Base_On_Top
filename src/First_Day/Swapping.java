package First_Day;

public class Swapping {

    /*
    // Question 1 Swap to numbers
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping Value of A  " + a);
        System.out.println("Before Swapping Value of B  " + b);
        // now swap so we are need a third variable

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping A " +a);
        System.out.println("After Swapping B " +b);

    }
     */

    // Swap to Number Without using third variable
    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        System.out.println("Before Swaping " +"A = "+ a +", --> B = "+ b);
        // Step 1 total of both
        a = a+b;

        // Step 2 minus one by one
         b = a-b;
         a = a-b;

        System.out.println("After Swapping " + "A = " +a + ", --> B = "+ b);

    }
}
