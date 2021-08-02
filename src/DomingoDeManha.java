import java.util.Scanner;
import java.io.IOException;

public class DomingoDeManha {
        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int i = 0;

            while (leitor.hasNext()) {
                String[] relogio = leitor.nextLine().split(":");
                int hora = Integer.parseInt(relogio[0]);
                int min = Integer.parseInt(relogio[1]);
                switch (  hora  ) {
                    case(7): System.out.println("Atraso maximo: " + min); break;
                    case(8): System.out.println("Atraso maximo: " + (min + 60)); break;
                    case(9): System.out.println("Atraso maximo: " + ( min + 120 )); break;
                    case(10): System.out.println("Atraso maximo: " + ( min + 180 )); break;
                    case(11): System.out.println("Atraso maximo: " + ( min + 240 )); break;
                    default: System.out.println("Atraso maximo: 0");
                }
            }
        }
    }

