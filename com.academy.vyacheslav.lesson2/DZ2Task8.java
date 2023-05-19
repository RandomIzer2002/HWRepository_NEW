import java.util.Scanner;

public class DZ2Task8 {
    public static void main(String[] args){
        rounder();
    }

    public static void rounder(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число с количеством порядков после запятой не менее 5: ");
        double fracNum = scanner.nextDouble();
        double roundedNum = Math.round(fracNum * 1000.0) / 1000.0;
        System.out.println("Округлённое число: " + roundedNum);
        scanner.close();
    }
}
