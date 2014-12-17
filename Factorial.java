/**
 * Created by devon on 17/12/2014.
 */
public class Factorial {

    int f ( int n){

        if ( n==1){

            return n;

        }
        else { int result = n* f (n -1);
            return result;}
    }
}
