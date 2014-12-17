import java.util.Scanner;

/**
 * Created by devon on 17/12/2014.
 */
public class Power {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int bas = user.nextInt();
        int expon = user.nextInt();

        System.out.println( power(bas, expon));


    }

    static int power(int a,int b) {
        int result = a;


        if ( b==0){
            return result;


    }
        else{
             result = a*a;

            System.out.println(" a: :" +  a);
            System.out.println(" Result :" +  result);
            System.out.println(" b: "+ b);
            power(result,b-1);

            return 2;}




    }
}

