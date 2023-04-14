/*Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. 
Затем вводится число, на которое нужно умножить все введённые выше числа. 
Выведите на экран результат умножения построчно.
Sample Input:
4
1
2
3
5
2
Sample Output:
2
4
6
10*/

package For_java_HW;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n =  ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("Введите число:  ");
            array[i] = sc.nextInt();
        }
        System.out.print("Введите множитель:  ");
        int num = sc.nextInt();
        for (int i : array) {
            System.out.println(i * num);
        }
        sc.close();
    }
}
