package Calculate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) throws Exception {
        try {
            Scanner console = new Scanner(System.in);
            double argument1 = console.nextDouble();
            String name = console.next();
            double argument2 = console.nextDouble();
            System.out.println(new Actions().whatToDo(argument1, name, argument2));
        } catch (InputMismatchException e) {
            System.out.println("Некорректные данные...Сначала введи число,потом действие, и поотм еще одно число");
            e.printStackTrace();
        }

    }
}
