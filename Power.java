import java.util.Scanner;

/**
 * Created by devon on 17/12/2014.
 */
public class Power {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int bas = user.nextInt();

        int expon = user.nextInt();

        int result = power(bas, expon);
        System.out.println( result);


    }

    static int power(int a,int b) {




        if ( b==1){
            return a;


    }
        else {


            --b;
            return a * power( a, b);}





    }
}

