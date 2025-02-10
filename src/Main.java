import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        int[] salary = {5000, 6000, 8395, 1450, 500};
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum = sum += salary[i];
        }
        System.out.println("Сумма трат за месяц составила "+ sum  +" рублей");

        System.out.println();
        System.out.println("задача 2");
        int[] salary2 = {450, 7000, 10395, 6450, 500};
       int min = Arrays.stream(salary2).min().getAsInt();
       int max = Arrays.stream(salary2).max().getAsInt();
        System.out.println("Минимальная сумма трат за неделю составила "+ min +" рублей. Максимальная сумма трат за неделю составила "+max+" рублей");
        System.out.println();
        System.out.println("задача 3");

        double[] sum2 = {300, 345 , 4780, 5500, 1850};
        double totalSum2 = 0;
        for (double num : sum2){
            totalSum2 += num;
        }
        double average = totalSum2 / sum2.length;
        System.out.println( average);
        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(reverseFullName));





    }

}