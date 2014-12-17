import java.util.Scanner;

/**
 * Created by devon on 17/12/2014.
 */
public class Power {
    static int result;
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int bas = user.nextInt();
        int expon = user.nextInt();

        System.out.println( power(bas, expon));


    }

    static int power(int a,int b) {
        result = a;


        if ( b==1){
            return result;


    }
        else{
            result += result*a;
            System.out.println( " B: "+ b);
            power(a,b-1);
            System.out.println(" Result :" +  result);
            System.out.println( b);
            return 2;}




    }
}

