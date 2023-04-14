/*Task_3.
Реализовать простой калькулятор (+,-,/,*), только с целыми числами.*/

package For_java_HW;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число:  ");
        int num1 = sc.nextInt();
        System.out.print("Введите операцию:  ");
        String action = sc.next();
        System.out.print("Введите второе число:  ");
        int num2 = sc.nextInt();
        switch (action) {
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                double a = num1;
                System.out.println(a / num2);
                break;
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println("Неверная операция");
                break;
        }
        sc.close();        
    }
}
