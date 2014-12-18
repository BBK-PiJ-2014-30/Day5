import java.util.Scanner;

/**
 * Created by devon on 17/12/2014.
 */
public class Power {
static int base;
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int bas = user.nextInt();
        base =bas;
        int expon = user.nextInt();

        int result = power(bas, expon);
        System.out.println( result);


    }

    static int power(int a,int b) {




        if ( b==1){
            return a;


    }
        else {
            a = a*base;

          return power(a, b-1);}





    }
}

