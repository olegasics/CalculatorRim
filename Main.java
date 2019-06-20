import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Введите выражение");
                String str = in.readLine();
               String[] array = str.split(" ");
               Logic logic = new Logic(array);
               
               }

        }
