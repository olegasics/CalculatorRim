import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


                System.out.println("Введите выражение");
                String str = in.readLine();
               String[] array = str.split(" ");
                if(array[1].equals("+")) {
                    Plus plus = new Plus();
                    System.out.println(plus.Operation(Integer.parseInt(array[0]), Integer.parseInt(array[2])));
                }
                if(array[1].equals("-")) {
                    Minus minus = new Minus();
                    System.out.printf("Результат : " + "%d", minus.Operation(Integer.parseInt(array[0]), Integer.parseInt(array[2])));
                }

                if (array[1].equals("*")) {
                    Multi multi = new Multi();
                    System.out.printf("Результат : " + "%d", multi.Operation(Integer.parseInt(array[0]), Integer.parseInt(array[2])));
                }

                if(array[1].equals("/")) {
                    Description description = new Description();
                    System.out.printf("Результат : " + "%d", description.Operation(Integer.parseInt(array[0]), Integer.parseInt(array[2])));
                }

        }

}
