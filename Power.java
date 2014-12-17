import java.util.Scanner;

/**
 * Created by devon on 17/12/2014.
 */
public class Power {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        int expon = user.nextInt();
        int bas = user.nextInt();
        int result = power(bas, expon);
        System.out.println( result);


    }

    static int power(int a, int b) {

        int result = a * a;


        if (b == 0) {
            return result;
        }
        
        else { return 0;
    }
}
}
