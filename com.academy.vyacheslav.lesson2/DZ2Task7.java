import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;

public class DZ2Task7 {
    public static void main(String[] args) {
        bigRandomizer();
    }

    public static void bigRandomizer(){
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("Случайное число: " + randomNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        BigInteger bigNum = scanner.nextBigInteger();
        if (bigNum.compareTo(new BigInteger("100000000000000000000")) > 0) {
            System.out.println("Вы ввели число с порядком более чем 10^20");
            // bigNum = bigNum.multiply(randomNumber);
            BigInteger numMultiple = BigInteger.valueOf(randomNumber).multiply(bigNum);
            System.out.println("Результат умножения чисел: " +  numMultiple);
        } else {
            System.out.println("Вы ввели число с порядком менее чем 10^20");
        }
        scanner.close();
    }
}