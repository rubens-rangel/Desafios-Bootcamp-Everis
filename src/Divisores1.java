import java.io.IOException;
import java.util.Scanner;

public class Divisores1 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int i = 0;

        for ( i=1;  i < (N+1); i++ ) {
            if ( N%i <= 0 )
                System.out.println(i);
        }
    }
}


