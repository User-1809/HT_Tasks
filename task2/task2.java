import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Нужно передать 2 аргумента: путь к файлу эллипса и файлу точек");
            return;
        }

        try {
            Scanner scEllipse = new Scanner(new File(args[0]));
            double x0 = scEllipse.nextDouble();
            double y0 = scEllipse.nextDouble();
            double a = scEllipse.nextDouble();
            double b = scEllipse.nextDouble();
            scEllipse.close();

            double a2 = a * a;
            double b2 = b * b;

            Scanner scPoints = new Scanner(new File(args[1]));

            while (scPoints.hasNextDouble()) {
                double x = scPoints.nextDouble();
                double y = scPoints.nextDouble();

                double leftPart = (x - x0) * (x - x0) * b2 + (y - y0) * (y - y0) * a2;
                double rightPart = a2 * b2;

                if (Math.abs(leftPart - rightPart) < 1e-9 * rightPart) {
                    System.out.println(0); // На окружности/эллипсе
                } else if (leftPart < rightPart) {
                    System.out.println(1); // Внутри
                } else {
                    System.out.println(2); // Снаружи
                }
            }
            scPoints.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: один из файлов не найден.");
        }
    }
}
